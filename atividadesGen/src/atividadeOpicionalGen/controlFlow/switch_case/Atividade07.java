package atividadeOpicionalGen.controlFlow.switch_case;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		/*
		 * Dias da Semana: Escreva um programa que peça um número de 1 a 7 e use
		 * switch-case para exibir o dia da semana correspondente (1 para Domingo, 2
		 * para Segunda, etc.).
		 */

		Scanner sc = new Scanner(System.in);

		int num;
		String diaSemana = "";

		System.out.println("Digite um número entre 1 e 7:");
		num = sc.nextInt();

		switch (num) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-Feira";
			break;
		case 3:
			diaSemana = "Terça-Feira";
			break;
		case 4:
			diaSemana = "Quarta-Feira";
			break;
		case 5:
			diaSemana = "Quinta-Feira";
			break;
		case 6:
			diaSemana = "Sexta-Feira";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			System.out.println("Número inválido");
			break;
		}
		System.out.println("O dia da semana é: " + diaSemana);
	}
}
