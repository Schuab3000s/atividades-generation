package atividadesGen.dia_9.matrizes;

public class Atividade1 {
	public static void main(String[] args) {

		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int somaDP=0, somaDS=0;
		
		// somaDP = soma da diagonal principal
		// somaDS = soma da diagonal secundária
		
		System.out.println("Elementos da Diagonal princial:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");
					somaDP+=matriz[i][j];
				}
			}
		}

		System.out.println("\nElementos da Diagonal secundária:");
		int coluna = 2;
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][coluna] + " ");
			somaDS+=matriz[i][coluna];
			coluna--;
			
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal: "+ somaDP);
		System.out.println("Soma dos Elementos da Diagonal Secundária: "+ somaDS);
	}

}
