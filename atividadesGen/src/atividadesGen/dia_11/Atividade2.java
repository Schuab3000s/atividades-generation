package atividadesGen.dia_11;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		Scanner entrada = new Scanner(System.in);

		byte opcao;
		boolean continuar = true;

		do {
			System.out.println("\n|-------------MENU--------------|");
			System.out.println("| 1 - Adicionar livro na pilha  |");
			System.out.println("| 2 - Listar todos os livros    |");
			System.out.println("| 3 - Retirar livro da fila     |");
			System.out.println("| 0 - Sair                      |");
			System.out.println("|_______________________________|");

			System.out.println("Qual a opção desejada?");
			opcao = entrada.nextByte();
			
			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro:");
				entrada.skip("\\R?");
				pilha.add(entrada.nextLine());

				System.out.println("\nLivro adicionado na pilha!");
				break;

			case 2:
				listagem(pilha, opcao);
				break;

			case 3:
				listagem(pilha, opcao);
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

	private static void listagem(Stack<String> pilha, byte opcao) {

		if (!pilha.isEmpty()) {
			if (opcao == 3) {
				pilha.pop();
			}

			System.out.println("\n-----------PILHA------------");

			if (!pilha.isEmpty()) {
				for (String livro : pilha) {
					System.out.println(livro);
				}
			} else {
				System.out.println("A pilha de livros acabou!");
			}

			System.out.println("----------------------------\n");
		} else {
			System.out.println("\nPilha vazia...");
		}
	}
}
