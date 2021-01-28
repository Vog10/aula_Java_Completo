package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio_while3 {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);

		int alcool, gasolina, diesel, x;

		alcool = 0;
		gasolina = 0;
		diesel = 0;

		System.out.println("PARA DIGITA ALCOOL 1 , GASOLINA 2, DIESEL 3.");
		x = vogin.nextInt();

		while (x != 4) {

			switch (x) {

			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			default:
				System.out.println("Codigo invalido!");
				break;
			}
			System.out.println("PARA DIGITE, ALCOOL 1 , GASOLINA 2, DIESEL 3.");
			x = vogin.nextInt();
		}

		System.out.println("Muito Obrigado!");
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		vogin.close();
	}

}
