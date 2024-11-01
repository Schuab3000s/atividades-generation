package atividadesGen.dia_10.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade1 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 10 números, por gentileza: (sem ser repetidos)");
		for (int i = 0; i < 10; i++) {

			System.out.println((i + 1) + "° número: ");
			int numero = entrada.nextInt();

			numeros.add(numero);
		}
		entrada.close();
		
		Iterator<Integer> numero = numeros.iterator();

		while (numero.hasNext()) {
			System.out.println(numero.next());
		}
	}
}