package atividadesGen.dia_11;

import java.util.Collection;
import java.util.Queue;
import java.util.Stack;

public class Listagem {

	public void listar(Collection<String> colecao, byte opcao) {

		if (!colecao.isEmpty()) {
			if (opcao == 3 && colecao instanceof Queue) {
				((Queue<String>) colecao).remove();
			} else if (opcao == 3 && colecao instanceof Stack) {
				((Stack<String>) colecao).pop();
			}

			System.out.println("\n-----------LISTAGEM-----------");

			if (!colecao.isEmpty()) {
				for (String cliente : colecao) {
					System.out.println(cliente);
				}
			} else if (colecao instanceof Queue) {
				System.out.println("O último cliente saiu da fila");
			} else if (colecao instanceof Stack) {
				System.out.println("A pilha de livros acabou!");
			}

			System.out.println("-------------------------------\n");
		} else if (colecao instanceof Queue) {
			System.out.println("\nFila vazia...");
		} else if (colecao instanceof Stack) {
			System.out.println("\nPilha vazia...");
		}
	}
}
