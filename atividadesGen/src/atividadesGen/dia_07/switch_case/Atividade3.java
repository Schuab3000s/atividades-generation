package atividadesGen.dia_07.switch_case;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		float num1, num2, resultado = 0;
		int opcao;

		Scanner entrada = new Scanner(System.in);

		System.out.println("|--------MENU---------|");
		System.out.println("|1 - Soma             |");
		System.out.println("|2 - Subtração        |");
		System.out.println("|3 - Multiplicação    |");
		System.out.println("|4 - Divisão          |");
		System.out.println("|_____________________|");

		System.out.println("\nQual opção opreção matemática você deseja?");
		opcao = entrada.nextInt();
		System.out.println("Digite o 1° número: ");
		num1 = entrada.nextFloat();
		System.out.println("Digite o 2° número: ");
		num2 = entrada.nextFloat();

		switch (opcao) {
		case 1:
			resultado = (num1 + num2);
			break;
		case 2:
			resultado = (num1 - num2);
			break;
		case 3:
			resultado = (num1 * num2);
			break;
		case 4:
			resultado = (num1 / num2);
			break;
		}
		System.out.printf("O resultado da opração é: %.2f", resultado);
	}
}
