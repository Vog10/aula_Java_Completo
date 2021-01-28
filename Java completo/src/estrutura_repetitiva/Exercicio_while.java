package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio_while {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);

		String nome;
		int senha;

		System.out.println("LOGIN: ");
		nome = vogin.next();
		System.out.println("SENHA: ");
		senha = vogin.nextInt();

		while (senha != 2002) {

			System.out.println("SENHA ERRADA!");
			System.out.println("DIGITE NOVAMENTE: ");
			senha = vogin.nextInt();

		}

		System.out.println("ACESSO PERMITIDO");

		vogin.close();
	}

}
