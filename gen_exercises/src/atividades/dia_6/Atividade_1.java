package atividades.dia_6;

import java.util.Scanner;

public class Atividade_1 {
	public static void main(String[] args) {

		float salario, abono, novoSalario;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o Salário: ");
		salario = entrada.nextFloat();
		System.out.println("Digite o Abono: ");
		abono = entrada.nextFloat();

		entrada.close();

		novoSalario = (salario + abono);

		System.out.printf("\nNovo Salário: %.2f", novoSalario);
	}
}
