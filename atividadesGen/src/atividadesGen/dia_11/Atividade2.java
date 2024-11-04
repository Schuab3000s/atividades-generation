package atividadesGen.dia_11;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		Scanner entrada = new Scanner(System.in);
		Listagem listagem = new Listagem();
		Menu menu = new Menu();

		byte opcao;
		boolean continuar = true;

		do {
			opcao = menu.menuPrincial(pilha);

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro:");
				entrada.skip("\\R?");
				pilha.add(entrada.nextLine());

				System.out.println("\nLivro adicionado na pilha!");
				break;

			case 2:
				listagem.listar(pilha, opcao);
				break;

			case 3:
				listagem.listar(pilha, opcao);
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
