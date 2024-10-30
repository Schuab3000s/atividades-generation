package atividadesGen.dia_8.laco_do_while;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		int numero = 0, somaNumPositivo = 0;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Digite um número:");
			numero = entrada.nextInt();

			if (numero > 0) {
				somaNumPositivo = somaNumPositivo + numero;
			}
		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + somaNumPositivo);
	}
}