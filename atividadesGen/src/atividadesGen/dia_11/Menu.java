package atividadesGen.dia_11;

import java.util.Collection;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Menu {

	public byte menuPrincial(Collection<String> colecao) {

		Scanner entrada = new Scanner(System.in);
		byte opcao = 0;

		System.out.println("\n|-------------MENU--------------|");

		if (colecao instanceof Queue) {

			System.out.println("| 1 - Adicionar cliente na fila |");
			System.out.println("| 2 - Listar todos os clientes  |");
			System.out.println("| 3 - Retirar cliente da fila   |");

		} else if (colecao instanceof Stack) {

			System.out.println("| 1 - Adicionar livro na pilha  |");
			System.out.println("| 2 - Listar todos os livros    |");
			System.out.println("| 3 - Retirar livro da fila     |");

		}
		System.out.println("| 0 - Sair                      |");
		System.out.println("|_______________________________|");

		System.out.println("Qual a opção desejada?");
		opcao = entrada.nextByte();
		
		return opcao;
	}

}
