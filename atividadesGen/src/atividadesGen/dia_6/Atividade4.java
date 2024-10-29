package atividadesGen.dia_6;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {

		float num1, num2, num3, num4, resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número 1: ");
		num1 = entrada.nextFloat();
		System.out.println("Digite o número 2: ");
		num2 = entrada.nextFloat();
		System.out.println("Digite o número 3: ");
		num3 = entrada.nextFloat();
		System.out.println("Digite o número 4: ");
		num4 = entrada.nextFloat();
		entrada.close();

		resultado = ((num1 * num2) - (num3 * num4));

		System.out.println("\nO resultado da diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: " + resultado);
	}
}
