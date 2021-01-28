package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);
		
		// instancia  a variavel junto coma a classe.
		
		Product p = new Product(); 
		
		// entradas do programa
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = vogin.nextLine();
		System.out.print("Price: ");
		double price = vogin.nextDouble();
		/*
		 * 
		 * System.out.print("Quantity in stock: ");
		int quantity = vogin.nextInt(); */
		
		
		
		// INSTACIAÇÃO DO CONSTRUTOR PARA QUE NÃO CRIE O PRODUTOR VAZIO SEM PREÇO OU NOME!!!
		Product product = new Product(name,price);
		
		System.out.println();
		
		//  saidas do programa com ToString, obs: (product.ToString) tambem!
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		// entrada e uma definição de uma varivel para metodo 
		int quantity =  vogin.nextInt();
		product.addProducts(quantity);
		
		// saida
		System.out.println();
		System.out.println("Updated data: " + product);
		
		// saida
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		// entrada
		quantity = vogin.nextInt();
		product.removeProducts(quantity);
		
		// saida
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		vogin.close();
	}

}
