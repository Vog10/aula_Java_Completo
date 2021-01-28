package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastrado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner vogin =  new Scanner(System.in);
		
		Cadastrado fucionario = new Cadastrado();
		
		System.out.println("Name:");
		fucionario.name = vogin.nextLine();
		System.out.println("Gross salary: ");
		fucionario.grossSalary = vogin.nextDouble();
		System.out.println("Tax: ");
		fucionario.tax =  vogin.nextDouble();
		
		System.out.println("Employee:  " + fucionario);
		System.out.println();

		System.out.println("Which percentage to increase salary? ");
		double percentage = vogin.nextDouble();
		fucionario.icreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + fucionario);
		
		
		

		
	vogin.close();	
	}

}
