package atividadesGen.dia_07.if_else;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		int idade;
		String nome;
		boolean primeiraDoacao;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o Nome do doador: ");
		nome = entrada.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = entrada.nextInt();
		System.out.println("Primeira doação de sangue?(true or false)");
		primeiraDoacao = entrada.nextBoolean();
		entrada.close();

		if (idade > 18 && idade < 69) {
			if (idade > 60 && primeiraDoacao) {
				System.out.println(nome + " está não apto(a) para doar sangue!");
			} else {
				System.out.println(nome + " está apto(a) para doar sangue!");
			}
		} else {
			System.out.println(nome + " está não apto(a) para doar sangue!");
		}
	}
}
