package entities;

// Herdando dados e comportamento da classe logo é uma herenca	
public class BuninessAccount extends Account {

	private Double loanLimit;

	public BuninessAccount() {

	}

	// Super classe junto com construtor da subclasse
	public BuninessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if(amount <= loanLimit) {
		balance += amount - 10.0; // taxa
		}
	}
	
	@Override /// informa que é uma sobreposicao!
	public void withDraw(double amount) {
		super.withDraw(amount); // reutilizado o codigo que ja esta no metodo do account
		balance -= 2.0; // add mais um calculo para essa classe Bun....

	}

}
