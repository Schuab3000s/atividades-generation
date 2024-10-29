package atividadesGen.dia_7.if_else;

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

		if (idade > 60 && idade < 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else if (idade > 60 && idade < 69 && primeiraDoacao == true) {
			System.out.println(nome + " está não apto(a) para doar sangue!");
		} else if (idade > 18) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else {
			System.out.println(nome + " está não apto(a) para doar sangue!");
		}
	}
}
