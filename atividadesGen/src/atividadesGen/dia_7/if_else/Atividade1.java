package atividadesGen.dia_7.if_else;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o número B: ");
		num2 = entrada.nextInt();
		System.out.println("Digite o número C: ");
		num3 = entrada.nextInt();
		entrada.close();

		if ((num1 + num2) > num3) {
			System.out.println("A soma de A + B (" + (num1 + num2) + ") é Maior do que C (" + num3 + ").");
		} else if ((num1 + num2) < num3) {
			System.out.println("A soma de A + B (" + (num1 + num2) + ") é Menor do que C (" + num3 + ").");
		} else {
			System.out.println("A soma de A + B (" + (num1 + num2) + ") é Igual do que C (" + num3 + ").");
		}
	}
}
