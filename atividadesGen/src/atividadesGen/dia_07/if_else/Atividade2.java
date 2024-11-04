package atividadesGen.dia_07.if_else;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		int numero;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		entrada.close();

		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O Número " + numero + " é par e positivo!");
		} else if (numero % 2 == 1 && numero > 0) {
			System.out.println("O Número " + numero + " é ímpar e positivo!");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O Número " + numero + " é par e negativo!");
		} else {
			System.out.println("O Número " + numero + " é ímpar e negativo!");
		}
	}
}
