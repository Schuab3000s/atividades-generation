package atividadeOpicionalGen.controlFlow.if_else;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		/*
		 * Verificação de Votação: Crie um programa que solicite ao usuário sua idade e
		 * se ele é cidadão. Se ele for maior de 18 anos e cidadão, o programa deve
		 * informar que ele pode votar; caso contrário, indique que ele não pode votar.
		 */

		Scanner sc = new Scanner(System.in);

		int idade;
		String cidadao;

		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Você é cidadão?(sim ou não)");
		sc.skip("\\R?");
		cidadao = sc.nextLine();

		if (idade > 18 && cidadao.equalsIgnoreCase("sim")) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você não pode votar");
		}
	}
}
