package estrutara_condicional;

import java.util.Scanner;

public class Condicional_if_else {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		float hora;

		System.out.println("digite as horas:");
		hora = vogin.nextFloat();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		vogin.close();
	}

}
