package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio_while2 {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		int x, y;

		System.out.println("Digite as cordenadas: ");
		x = vogin.nextInt();
		y = vogin.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {

				System.out.println("Quadrante 1");

			} else if (x < 0 && y > 0) {

				System.out.println("Quadrante 2");

			} else if (x < 0 && y < 0) {

				System.out.println("Quadrante 3");

			} else if (x > 0 && y < 0) {

				System.out.println("Quadrante 4");

			}
			/*
			 * else if (x == 0 && y == 0) {
			 * 
			 * System.out.println("Origem");
			 * 
			 * }
			 */
			System.out.println("Digite as cordenadas: ");
			x = vogin.nextInt();

			y = vogin.nextInt();
		}

		System.out.println("Fim do Programa");

		vogin.close();
	}

}
