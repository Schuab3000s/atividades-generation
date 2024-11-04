package atividadesGen.dia_07.if_else;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		String palavra1, palavra2, palavra3;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite se o animal é vertebrado ou invertebrado: ");
		palavra1 = entrada.nextLine();
		System.out.println("Digite se o animal é ave, mamífero, inseto ou anelídeo: ");
		palavra2 = entrada.nextLine();
		System.out.println("Digite se o animal é carnívoro, onívoro, herbívoro ou hematófago: ");
		palavra3 = entrada.nextLine();
		entrada.close();

		if (palavra1.equals("vertebrado")) {
			if (palavra2.equals("ave")) {
				if (palavra3.equals("carnívoro")) {
					System.out.println("\nÁguia");
				} else {
					System.out.println("\nPomba");
				}
			} else {
				if (palavra3.equals("onívoro")) {
					System.out.println("\nHomem");
				} else {
					System.out.println("\nVaca");
				}
			}
		} else {
			if (palavra2.equals("inseto")) {
				if (palavra3.equals("hematófago")) {
					System.out.println("\nPulga");
				} else {
					System.out.println("\nLagarta");
				}
			} else {
				if (palavra3.equals("hematófago")) {
					System.out.println("\nSanguessuga");
				} else {
					System.out.println("\nMinhoca");
				}
			}
		}
	}
}