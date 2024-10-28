package atividades.dia_6;

import java.util.Scanner;

public class atividade_3 {
	public static void main(String[] args) {

		float salarioBruto, addNoturno, hrsExtras, desconto, salarioLiquido;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = entrada.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		addNoturno = entrada.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		hrsExtras = entrada.nextFloat();
		System.out.println("Digite os Descontos: ");
		desconto = entrada.nextFloat();
		entrada.close();

		salarioLiquido = (salarioBruto + addNoturno + (hrsExtras * 5) - desconto);

		System.out.printf("\nSeu salário líquido é: %.2f", salarioLiquido);
	}
}
