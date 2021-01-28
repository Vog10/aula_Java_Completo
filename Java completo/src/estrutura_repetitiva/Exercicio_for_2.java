package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio_for_2 {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		int n, cont_in, cont_out;

		n = vogin.nextInt();

		cont_in = 0;
		cont_out = 0;
		for (int i = 0; i < n; i++) {

			int x = vogin.nextInt();

			if (x >= 10 && x <= 20) {

				cont_in += 1;
			} else {

				cont_out += 1;
			}

		}

		System.out.println(cont_in + " = IN");
		System.out.println(cont_out + " = OUT");
		vogin.close();
	}

}
