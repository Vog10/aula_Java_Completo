package estrutara_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */

		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		double raio, area;

		System.out.println("DIGITE O VALOR DO CIRCULO: ");
		raio = vogin.nextDouble();

		area = Math.PI * Math.pow(raio,2);
		
		System.out.printf("valor da área = %.4f\n ", area);
		
		vogin.close();
	}

}
