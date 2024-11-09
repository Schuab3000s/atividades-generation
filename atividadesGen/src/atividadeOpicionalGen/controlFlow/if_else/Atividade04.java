package atividadeOpicionalGen.controlFlow.if_else;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		/*
		 * Verificação de Votação: Crie um programa que solicite ao usuário sua idade e
		 * se ele é cidadão. Se ele for maior de 18 anos e cidadão, o programa deve
		 * informar que ele pode votar; caso contrário, indique que ele não pode votar.
		 */

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, maiorNum;

		System.out.println("Digite o 1° número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o 2° número: ");
		num2 = sc.nextInt();
		System.out.println("Digite o 3° número: ");
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			maiorNum = num1;
		} else if (num2 > num1 && num2 > num3) {
			maiorNum = num2;
		} else {
			maiorNum = num3;
		}

		System.out.println("O maior número é: " + maiorNum);
	}
}
