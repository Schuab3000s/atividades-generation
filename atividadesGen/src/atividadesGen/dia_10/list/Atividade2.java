package atividadesGen.dia_10.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		int numero;
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
			numero = entrada.nextInt();

			if (numeros.contains(numero)) {
				System.out.println("O número " + numero + " está localizado na posição: " + numeros.indexOf(numero));
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
