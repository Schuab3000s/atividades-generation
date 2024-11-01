package atividadesGen.dia_8.laco_for;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		int numero, par = 0, impar = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.println("Digite o " + i + "° número");
			numero = entrada.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		entrada.close();

		System.out.println("\nTotal de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
	}
}
