package atividadesGen.dia_8.laco_for;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		int num1, num2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = entrada.nextInt();
		System.out.println("");
		entrada.close();

		if (num1 < num2) {
			for (num1++; num1 < num2; num1++) {

				if (num1 % 3 == 0 && num1 % 5 == 0) {
					System.out.println(num1 + " é múltiplo de 3 e 5.");
				}

			}
		} else {
			System.out.println("\nIntervalo Inválido");
		}
	}
}
