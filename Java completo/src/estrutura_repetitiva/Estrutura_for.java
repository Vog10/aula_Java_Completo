package estrutura_repetitiva;

import java.util.Scanner;

public class Estrutura_for {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		int n = vogin.nextInt();

		int soma = 0;

		for (int i = 0; i < n; i++) {

			int x = vogin.nextInt();
			soma += x;
		}

		System.out.println(soma);

		vogin.close();
	}

}
