package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosCliente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		DadosCliente dadoscliente;

		System.out.print("Enter account number: ");
		int number = vogin.nextInt();
		System.out.print("Enter account holder: ");
		vogin.nextLine();
		String holders = vogin.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char response = vogin.next().charAt(0);

			// DEPOSIT INITIAL
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = vogin.nextDouble();

			dadoscliente = new DadosCliente(holders, number, initialDeposit);
		} 
		// DONT DEPOSIT INITIAL
		else {

			dadoscliente = new DadosCliente(holders, number);
		}

		//PRINT ACCOUNT AND DATA CLIENT
		System.out.println();
		System.out.println("account data:");
		System.out.println(dadoscliente);
		
		//DEPOSIT
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = vogin.nextDouble();
		dadoscliente.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(dadoscliente);
		
		// WITHDRAW ACCOUNT
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawtValue = vogin.nextDouble();
		dadoscliente.withdraw(withdrawtValue);
		System.out.println("Updated account data: ");
		System.out.println(dadoscliente);
		
		
		
		
		vogin.close();
	}

}
