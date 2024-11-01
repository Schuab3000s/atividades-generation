package atividadesGen.dia_9.matrizes;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {

		double matriz[][] = new double[10][4];
		double vetMedia[] = new double[10];
		double media = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {

			System.out.println("Digite a nota do " + (i + 1) + "° aluno: ");

			for (int j = 0; j < matriz[4].length; j++) {

				System.out.println("Nota do " + (j + 1) + "° Bimestre: ");

				matriz[i][j] = entrada.nextDouble();
				media += (matriz[i][j] / 4);
			}
			vetMedia[i] = media;
			media = 0;
		}
		entrada.close();

		System.out.println("A média dos alunos são: ");
		for (double medias : vetMedia) {
			System.out.printf(" | %.1f", medias);
		}
	}
}