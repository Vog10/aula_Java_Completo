package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_media_pondeirada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		int n = vogin.nextInt();

		for (int i = 0; i < n; i++) {

			double a = vogin.nextDouble();
			double b = vogin.nextDouble();
			double c = vogin.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		vogin.close();
	}

}
