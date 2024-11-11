package atividadeOpicionalGen.controlFlow.switch_case;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		/*
		 * Menu de Opções: Crie um programa com um menu simples onde o usuário pode
		 * escolher entre três opções diferentes, cada uma executando uma ação distinta.
		 * Use switch-case para tratar as opções e exibir a mensagem correspondente para
		 * cada uma delas.
		 */

		Scanner sc = new Scanner(System.in);

		byte opcao;

		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Dia");
		System.out.println("2 - Tarde");
		System.out.println("3 - Noite");
		opcao = sc.nextByte();

		switch (opcao) {
		case 1:
			System.out.println("Você prefere o dia.");
			break;
		case 2:
			System.out.println("Você prefere a tarde.");
			break;
		case 3:
			System.out.println("Você prefere a noite.");
			break;

		}
	}

}
