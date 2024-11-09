package atividadeOpicionalGen.controlFlow.if_else;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		/*
		 * Classificação de Notas: Escreva um programa que peça ao usuário uma nota
		 * entre 0 e 100. Se a nota for maior ou igual a 90, exiba "A"; se for entre 80
		 * e 89, exiba "B"; entre 70 e 79, exiba "C"; entre 60 e 69, exiba "D"; e abaixo
		 * de 60, exiba "F".
		 */

		Scanner sc = new Scanner(System.in);
		int nota;

		System.out.println("Digite uma nota: ");
		nota = sc.nextInt();

		if (nota >= 90) {
			System.out.println("A");
		} else if (nota >= 80) {
			System.out.println("B");
		} else if (nota >= 70) {
			System.out.println("C");
		} else if (nota >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
