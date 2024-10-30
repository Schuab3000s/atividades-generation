package atividadesGen.dia_8.laco_do_while;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {

		int numero = 0, quantidade = 0;
		double media = 0, soma = 0;

		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("Digite um número: ");
			numero = entrada.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma = (soma + numero);
				quantidade++;
			}
		} while (numero != 0);

		media = (soma / quantidade);

		System.out.printf("A média de todos os números múltiplos de 3 é: %.2f", media);
	}
}
