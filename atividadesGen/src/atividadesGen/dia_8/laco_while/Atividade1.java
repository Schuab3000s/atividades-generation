package atividadesGen.dia_8.laco_while;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		int idade = 0, menor21 = 0, maior50 = 0;

		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.println("Digite uma idade: ");
			idade = entrada.nextInt();

			if (idade < 0) {
				break;
			} else if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maior de 50 anos: " + maior50);
	}
}
