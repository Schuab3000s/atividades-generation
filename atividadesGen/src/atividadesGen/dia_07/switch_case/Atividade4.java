package atividadesGen.dia_07.switch_case;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		int opcao;
		float salario = 1000f, valor;

		Scanner entrada = new Scanner(System.in);

		System.out.println("|------MENU--------|");
		System.out.println("|1 - Saldo         |");
		System.out.println("|2 - Saque         |");
		System.out.println("|3 - Depósito      |");
		System.out.println("|__________________|");

		System.out.println("Qual opção você deseja?");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Operação - Saldo\n");
			System.out.printf("Seu saldo é: %.2f", salario);
			break;
		case 2:
			System.out.println("Operação - Saque\n");
			System.out.println("Quanto você deseja sacar?");
			valor = entrada.nextFloat();

			if (valor < salario) {
				salario = salario - valor;
				System.out.printf("Seu novo saldo é: %.2f", salario);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			break;
		case 3:
			System.out.println("Operação - Depósito\n");
			System.out.println("Quanto você deseja depositar?");
			valor = entrada.nextFloat();

			salario = salario + valor;

			System.out.printf("Seu novo saldo é: %.2f", salario);
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
	}
}
