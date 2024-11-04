package atividadesGen.dia_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner entrada = new Scanner(System.in);

		boolean continuar = true;
		byte opcao;

		do {

			System.out.println("\n|-------------MENU--------------|");
			System.out.println("| 1 - Adicionar cliente na fila |");
			System.out.println("| 2 - Listar todos os clientes  |");
			System.out.println("| 3 - Retirar cliente da fila   |");
			System.out.println("| 0 - Sair                      |");
			System.out.println("|_______________________________|");

			System.out.println("Qual a opção desejada?");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do cliente:");
				fila.add(entrada.next());

				System.out.println("\nCliente adicionado na fila!");
				break;

			case 2:
				listagem(fila, opcao);
				break;

			case 3:
				listagem(fila, opcao);
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

	private static void listagem(Queue<String> fila, byte opcao) {

		if (!fila.isEmpty()) {
			if (opcao == 3) {
				fila.remove();
			}

			System.out.println("\n-----------LISTA------------");

			if (!fila.isEmpty()) {
				for (String cliente : fila) {
					System.out.println(cliente);
				}
			} else {
				System.out.println("O último cliente saiu da fila");
			}

			System.out.println("----------------------------\n");
		} else {
			System.out.println("\nFila vazia...");
		}
	}
}