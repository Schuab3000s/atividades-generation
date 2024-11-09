package atividadeOpicionalGen.controlFlow.switch_case;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		/*
		 * Classificação de Notas (usando switch-case): Peça ao usuário uma nota de A a
		 * F e use switch-case para exibir a descrição da nota (A = Excelente, B = Bom,
		 * C = Médio, D = Ruim, F = Insuficiente).
		 */

		Scanner sc = new Scanner(System.in);

		char nota;
		String resultado;

		System.out.println("Digite uma nota: (A-B-C-D-F");
		nota = sc.next().charAt(0);

		switch (nota) {
		case 'A', 'a':
			resultado = "Excelente";
			break;
		case 'B', 'b':
			resultado = "Boa";
			break;
		case 'C', 'c':
			resultado = "Média";
			break;
		case 'D', 'd':
			resultado = "Ruim";
			break;
		case 'F', 'f':
			resultado = "Insuficiente";
			break;
		default:
			resultado = "Nota inválida";
			break;
		}

		System.out.println(resultado);
	}
}
