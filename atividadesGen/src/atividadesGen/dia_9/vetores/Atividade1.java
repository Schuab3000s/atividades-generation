package atividadesGen.dia_9.vetores;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero, i = 0;
		boolean numEncontrado = false;
		char continuar;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Digite o número que você deseja encontrar: ");
			numero = entrada.nextInt();

			for (i = 0; i < numeros.length; i++) {

				if (numero == numeros[i]) {
					numEncontrado = true;
					break;
				} else {
					numEncontrado = false;
				}
			}
			if (numEncontrado) {
				System.out.println("\nO número " + numero + " está localizao na posição: " + i);
			} else {
				System.out.println("\nO número " + numero + " não foi encontrado!");
			}

			System.out.println("\nDeseja inserir outro número: (s/n)");
			continuar = entrada.next().charAt(0);

		} while (continuar == 's');
		entrada.close();

		System.out.println("\nFinalizando o sistema...");
		System.out.println("\nFinalizado!!");
	}
}
