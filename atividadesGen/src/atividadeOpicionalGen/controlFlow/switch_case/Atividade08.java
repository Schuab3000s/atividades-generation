package atividadeOpicionalGen.controlFlow.switch_case;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		/*
		 * Classificação por Faixa Etária: Peça ao usuário para digitar sua idade e use
		 * switch-case para classificá-lo como "Criança", "Adolescente", "Adulto" ou
		 * "Idoso", dependendo da faixa etária (0-12, 13-19, 20-59, 60+).
		 */

		Scanner sc = new Scanner(System.in);
		int idade;
		String classificacao;

		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();

		int faixa = idade / 10;

		switch (faixa) {
		case 0:
		case 1:
			classificacao = (idade <= 12) ? "Criança" : "Adolescente";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			classificacao = "Adulto";
			break;
		default:
			classificacao = "Idoso";
			break;
		}
		System.out.println(classificacao);
	}
}
