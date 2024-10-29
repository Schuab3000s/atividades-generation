package atividades.dia_6;

import java.util.Scanner;

public class Atividade_2 {
	public static void main(String[] args) {

		float nota1, nota2, nota3, nota4, media;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota 1:");
		nota1 = entrada.nextFloat();
		System.out.println("Digite a nota 2:");
		nota2 = entrada.nextFloat();
		System.out.println("Digite a nota 3:");
		nota3 = entrada.nextFloat();
		System.out.println("Digite a nota 4:");
		nota4 = entrada.nextFloat();
		entrada.close();

		media = ((nota1 + nota2 + nota3 + nota4) / 4);

		System.out.printf("\nSua média final é: %.1f", media);
	}
}
