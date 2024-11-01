package atividadesGen.dia_10.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade2 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		char continuar;

		Scanner entrada = new Scanner(System.in);

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		do {
			System.out.println("Qual número você deseja encontrar: ");
			int numero = entrada.nextInt();

			if (numeros.contains(numero)) {
				System.out.println("O número " + numero + " foi encontrado");
			} else {
				System.out.println("O número " + numero + " não foi encontrado!");
			}

			System.out.println("Deseja procurar outro número?(s/n)");
			continuar = entrada.next().charAt(0);

		} while (continuar == 's');
		entrada.close();

		System.out.println("Programa finalizado!!");
	}
}
