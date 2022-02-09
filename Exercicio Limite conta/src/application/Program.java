package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = vogin.nextInt();
		vogin.nextLine();
		System.out.print("Holder: ");
		String holder = vogin.nextLine();
		System.out.print("Initial balance: ");
		double balance = vogin.nextDouble();
		vogin.nextLine();
		System.out.print("Withdraw limit: ");
		double withdrawlimit = vogin.nextDouble();

		Account account = new Account(number, holder, balance, withdrawlimit);

		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		Double withdraw = vogin.nextDouble();

		
		// 
		try {
			// chamando withdraw
			account.withdraw(withdraw);
			System.out.printf("New balance: %.2f%n ", account.getBalance());

		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

		vogin.close();
	}

}
