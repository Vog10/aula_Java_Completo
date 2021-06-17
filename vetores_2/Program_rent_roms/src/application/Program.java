package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int n = vogin.nextInt();

		Product[] vect = new Product[9];

		for (int i = 0; i < n; i++) {

			System.out.printf("Rent #%d:\n", i + 1);
			vogin.nextLine();
			System.out.print("Name: ");
			String name = vogin.nextLine();
			System.out.print("Email: ");
			String email = vogin.nextLine();
			System.out.print("Room: ");
			int room = vogin.nextInt();
			vect[room] = new Product(name, email);

		}

		System.out.println();
		System.out.println(" Busy rooms: ");
		for (int i = 0; i < 9; i++) {
			
			if( vect[i] != null ) {
				
				System.out.println(i + ": " +  vect[i]);
			}
		}

		vogin.close();
	}

}
