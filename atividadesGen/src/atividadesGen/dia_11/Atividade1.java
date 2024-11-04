package atividadesGen.dia_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner entrada = new Scanner(System.in);
		Listagem listagem = new Listagem();
		Menu menu = new Menu();

		boolean continuar = true;
		byte opcao;

		do {
			opcao = menu.menuPrincial(fila);

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do cliente:");
				entrada.skip("\\R?");
				fila.add(entrada.nextLine());

				System.out.println("\nCliente adicionado na fila!");
				break;

			case 2:
				listagem.listar(fila, opcao);
				break;

			case 3:
				listagem.listar(fila, opcao);
				break;

			case 0:
				System.out.println("\nSaindo do sistema...");
				continuar = false;
				entrada.close();
				break;

			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (continuar);

		System.out.println("\nSistema finalizado!");
	}
}