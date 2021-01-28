package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductRectangle;

public class Program {

	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner vogin =  new Scanner(System.in);
		
		// instanciação da variavel com classe 
		ProductRectangle rectangle =  new ProductRectangle();
		
		
		System.out.println("Enter rectangle width  and height");
		rectangle.heigth = vogin.nextDouble();
		rectangle.width = vogin.nextDouble();
		
		
		System.out.printf("Area =  %.2f%n", rectangle.areaProuct());
		System.out.printf("Perimeter =  %.2f%n", rectangle.perimeterProduct());
		System.out.printf("Diagonal =  %.2f%n", rectangle.diagonalProduct());
		
		
		
		vogin.close();
	}

}
