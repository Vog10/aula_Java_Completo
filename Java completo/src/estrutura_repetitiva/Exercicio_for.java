package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio_for {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);

		int x;

		x = vogin.nextInt();

		for (int i = 0; i < x; i++) {

			if (i % 2 != 0) {

				System.out.println(i);

			}

		}

		vogin.close();
	}

}
