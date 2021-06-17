package vet;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		int n = vogin.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {

			vect[i] = vogin.nextDouble();

		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {

			sum += vect[i];

		}

		
		double avg = sum / n;
		
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg );
		
		vogin.close();
	}

}
