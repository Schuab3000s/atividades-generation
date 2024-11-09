package atividadeOpicionalGen.controlFlow.switch_case;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		/*
		 * Calculadora Simples: Crie um programa que peça dois números e uma operação
		 * matemática (+, -, *, /) e use switch-case para realizar a operação
		 * correspondente.
		 */

		Scanner sc = new Scanner(System.in);
		byte opcao;
		int num1, num2, resultado = 0;

		System.out.println("|--------MENU---------|");
		System.out.println("|1 - Soma             |");
		System.out.println("|2 - Subtração        |");
		System.out.println("|3 - Multiplicação    |");
		System.out.println("|4 - Divisão          |");
		System.out.println("|_____________________|");

		System.out.println("\nQual opção opreção matemática você deseja?");
		opcao = sc.nextByte();
		System.out.println("Digite o 1° número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o 2° número: ");
		num2 = sc.nextInt();

		switch (opcao) {
		case 1:
			resultado = (num1 + num2);
			break;
		case 2:
			resultado = (num1 - num2);
			break;
		case 3:
			resultado = (num1 * num2);
			break;
		case 4:
			resultado = (num1 / num2);
			break;
		}
		System.out.println("O resultado da opração é: " + resultado);
	}

}
