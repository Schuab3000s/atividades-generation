package atividadesGen.dia_08.laco_while;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {

		int idade, genero, area;
		int numPessoaBack = 0, totalPessoa = 0;
		int mulherCisTransFront = 0;
		int homemCisTransMobileMais40 = 0;
		int naoBinarioFullStackMenor30 = 0;
		double media = 0;
		char continuar = 's';

		Scanner entrada = new Scanner(System.in);

		while (continuar == 's') {
			System.out.println("Qual sua idade: ");
			idade = entrada.nextInt();
			System.out.println("");
			System.out.println("|--Identidade de Gênero--|");
			System.out.println("| 1 - Mulher Cis         |");
			System.out.println("| 2 - Homem Cis          |");
			System.out.println("| 3 - Não Binário        |");
			System.out.println("| 4 - Mulher Trans       |");
			System.out.println("| 5 - Homem Tans         |");
			System.out.println("| 6 - Outros             |");
			System.out.println("|________________________|");
			System.out.println("Qual sua identidade de gênero?");
			genero = entrada.nextInt();
			System.out.println("");
			System.out.println("|--Pessoa Desenvolvedora--|");
			System.out.println("| 1 - Backend             |");
			System.out.println("| 2 - Frontend            |");
			System.out.println("| 3 - Mobile              |");
			System.out.println("| 4 - FullStack           |");
			System.out.println("|_________________________|");
			System.out.println("Qual área você é?");
			area = entrada.nextInt();

			if (area == 1) {
				numPessoaBack++;
			}
			if ((genero == 1 || genero == 4) && area == 2) {
				mulherCisTransFront++;
			}
			if ((genero == 2 || genero == 5) && area == 3 && idade>40) {
				homemCisTransMobileMais40++;
			}
			if (genero == 3 && area == 4 && idade < 30) {
				naoBinarioFullStackMenor30++;
			}

			totalPessoa++;
			media = (media + idade);

			System.out.println("Deseja continuar? (s/n)");
			continuar = entrada.next().charAt(0);
		}
		entrada.close();
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + numPessoaBack);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherCisTransFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemCisTransMobileMais40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarioFullStackMenor30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoa);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", (media / totalPessoa));
	}
}
