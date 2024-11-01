package atividadesGen.dia_10.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		List<String> cores = new ArrayList<String>();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 5 cores: ");
		for (int i = 0; i < 5; i++) {

			String cor;

			System.out.println((i + 1) + "° cor:");

			cor = entrada.nextLine();
			cores.add(cor);
		}
		entrada.close();

		System.out.println("------------");
		for (String cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println("------------");
		for (String cor : cores) {
			System.out.println(cor);
		}
	}
}
