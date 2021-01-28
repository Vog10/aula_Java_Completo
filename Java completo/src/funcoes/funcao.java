package funcoes;

import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = vogin.nextInt();
		int b = vogin.nextInt();
		int c = vogin.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		vogin.close();
	}

	public static int max(int x, int y, int z) {

		int aux;

		if (x > y && x > z) {

			aux = x;
		} else if (y > z) {

			aux = y;
		} else {
			aux = z;
		}

		return aux;

	}

	public static void showResult(int value) {

		System.out.println("Higher = " + value);
	}

}
