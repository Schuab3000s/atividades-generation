package atividadeOpicionalGen.controlFlow.if_else;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		 * Número Par ou Ímpar: Peça ao usuário que insira um número inteiro e use
		 * if-else para determinar se o número é par ou ímpar.
		 */

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número digitado é PAR");
		} else {
			System.out.println("O número digitado é IMPAR");
		}
	}

}
