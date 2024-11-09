package atividadeOpicionalGen.controlFlow.if_else;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		/*
		 * Verificação de Maioridade: Escreva um programa que peça ao usuário para
		 * digitar sua idade. Se a idade for 18 ou mais, o programa deve exibir
		 * "Você é maior de idade". Caso contrário, exiba "Você é menor de idade".
		 */

		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
	}

}
