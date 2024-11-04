package atividadesGen.dia_07.switch_case;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		int opcao, quantidade, total = 0;
		String produto = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("|---------------MENU---------------|");
		System.out.println("|1 - Cachorro Quente-------R$10,00 |");
		System.out.println("|2 - X-Salada--------------R$15,00 |");
		System.out.println("|3 - X-Bacon---------------R$18,00 |");
		System.out.println("|4 - Bauru-----------------R$12,00 |");
		System.out.println("|5 - Refrigerante-----------R$8,00 |");
		System.out.println("|6 - Suco de Laranja-------R$13,00 |");
		System.out.println("|__________________________________|");

		System.out.println("\nEscolha uma opção:");
		opcao = entrada.nextInt();
		
		if (opcao >= 1 && opcao <= 6) {
			
			System.out.println("Qaul a quantidade que você levará?");
			quantidade = entrada.nextInt();
			entrada.close();

			switch (opcao) {
			case 1:
				produto = "Cachorro Quente";
				total = quantidade * 10;
				break;
			case 2:
				produto = "X-Salada";
				total = quantidade * 15;
				break;
			case 3:
				produto = "X-Bacon";
				total = quantidade * 18;
				break;
			case 4:
				produto = "Bauru";
				total = quantidade * 12;
				break;
			case 5:
				produto = "Refrigerante";
				total = quantidade * 8;
				break;
			case 6:
				produto = "Suco de Laranja";
				total = quantidade * 13;
				break;
			}
			System.out.println("\nProduto: " + produto);
			System.out.println("Valor Total: R$" + total + ",00");
			
		} else {
			System.out.println("Opção inválida");
		}
	}
}