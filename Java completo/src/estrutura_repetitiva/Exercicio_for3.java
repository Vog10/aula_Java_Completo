package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio_for3 {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);

		int n = vogin.nextInt();
		double soma;
		for (int i = 0; i < n; i++) {

			double a = vogin.nextInt();
			double b = vogin.nextInt();

			if (b == 0) {

				System.out.println(" Divisao impossivel");
			} else {

				soma = a / b;
				System.out.println(soma);
			}

		}
		System.out.println("fim do programa!");
		vogin.close();
	}

}
