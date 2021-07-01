package application;

import entities.Account;
import entities.BuninessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	
		Account acc = new Account(1001, "Alex", 0.0);
		BuninessAccount bacc = new BuninessAccount(1002, "maria", 0.0, 500.0);
		
		//UPCASTING 

		Account acc1 = bacc;
		Account acc2 = new BuninessAccount(1003, "bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "anna", 0.0, 0.01);
		
		// DOWNCASTING = COVERTE DA SUPERCLASSE PARA SUBCLASSE PROCESSO INVERSO
		
		BuninessAccount acc4 = (BuninessAccount)acc2; 
		acc4.loan(100.0);
		
		// BuninessAccount acc5 = (BuninessAccount) acc3; erro recorrente, pois uma classe nao e herenca da outra.
		
		if(acc3 instanceof BuninessAccount) { // instanceof. Verificar se a classe tem heranca com a mesma.
			
			BuninessAccount acc5 = (BuninessAccount) acc3; // Esse if falha pois nao e instancia.
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		// SOBREPOSICAO OU SOBRESCRITA
			// É a implmentacao de um método de uma superclasse na subclasse
		
		Account acc6 = new Account(1005, "carlos", 1000.0);
		acc6.withDraw(200.0);
		System.out.println(acc6.getBalance());
		
					// upcasting
		Account acc7 = new SavingsAccount(1006, "anna", 1000.0, 0.01);
		acc7.withDraw(200.0);
		System.out.println(acc7.getBalance());
		
		
		// USANDO O SUPER NO METODO
	
		Account acc8 = new BuninessAccount(1007, "bob", 1000.0, 500.0);
		acc8.withDraw(200);
		System.out.println(acc8.getBalance());
		
		
	}

}
