package estrutura_repetitiva;

import java.util.Scanner;

public class Estrutura_while {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner vogin = new Scanner(System.in);

		int x = vogin.nextInt();

		int soma = 0;

		while (x != 0) {

			soma = +x;
			x = vogin.nextInt();

		}

		System.out.println("SOMA = " + soma);
	}

}
