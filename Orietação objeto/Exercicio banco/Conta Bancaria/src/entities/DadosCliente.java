package entities;

public class DadosCliente {

	private String holders;
	private int number;
	private double balance;

	public DadosCliente(String holders, int number) {
		
		this.holders = holders;
		this.number = number;
	} 

	public DadosCliente(String holders, int number, double initialDeposit) {
		
		this.holders = holders;
		this.number = number;
		deposit(initialDeposit);
	}

	public String getHolders() {
		return holders;
	}

	public void setHolders(String holders) {
		this.holders = holders;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		balance += amount;
	}
	
	public void withdraw(double amount) {
		
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " 
				+ number
				+ ", Holder: "
				+ holders
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
