package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_do_while {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner vogin = new Scanner(System.in);

		char resp = 's';

		do {
			System.out.print("Digite a temperatura em Celsisus: ");
			double c = vogin.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equevalente em fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir (s/n)? ");
			resp = vogin.next().charAt(0);
		} while (resp != 'n');

		System.out.println("FIM DO PROGRAMA");

		vogin.close();
	}

}
