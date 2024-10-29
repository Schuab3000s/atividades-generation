package atividadesGen.dia_7.switch_case;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		String nome, profissao = "";
		int opcao;
		float salario;

		Scanner entrada = new Scanner(System.in);

		System.out.println("|-------MENU-------|");
		System.out.println("|1 - Gerente       |");
		System.out.println("|2 - Vendedor      |");
		System.out.println("|3 - Supervisor    |");
		System.out.println("|4 - Motorista     |");
		System.out.println("|5 - Estoquista    |");
		System.out.println("|6 - Técnico de TI |");
		System.out.println("|__________________|");

		System.out.println("\nDigite o nome do colaborador: ");
		nome = entrada.nextLine();
		System.out.println("Escolha sua profissão: ");
		opcao = entrada.nextInt();
		System.out.println("Digite seu salário: ");
		salario = entrada.nextFloat();

		switch (opcao) {
		case 1:
			profissao = "Gerente";
			salario = (salario * 1.1f);
			break;
		case 2:
			profissao = "Vendedor";
			salario = (salario * 1.07f);
			break;
		case 3:
			profissao = "Supervisor";
			salario = (salario * 1.09f);
			break;
		case 4:
			profissao = "Motorista";
			salario = (salario * 1.06f);
			break;
		case 5:
			profissao = "Estoquista";
			salario = (salario * 1.05f);
			break;
		case 6:
			profissao = "Técnico de TI";
			salario = (salario * 1.08f);
			break;
		}
		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo: " + profissao);
		System.out.printf("Salário: %.2f", salario);
	}
}
