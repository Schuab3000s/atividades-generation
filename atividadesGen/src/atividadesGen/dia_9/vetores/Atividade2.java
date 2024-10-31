package atividadesGen.dia_9.vetores;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {

		int numeros[] = new int[10];
		int soma = 0;
		double media = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			numeros[i] = entrada.nextInt();
			entrada.close();
			soma += numeros[i];
		}
		media = (soma / numeros.length);

		System.out.println("Elementos nos índices ímpares: ");
		for (int i = 1; i < numeros.length; i += 2) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f", media);
	}
}
