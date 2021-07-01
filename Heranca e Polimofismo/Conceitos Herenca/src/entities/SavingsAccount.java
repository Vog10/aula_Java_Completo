package entities;

public class SavingsAccount extends Account {

	private Double interestRare;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRare) {
		super(number, holder, balance);
		this.interestRare = interestRare;
	}

	public Double getInterestRare() {
		return interestRare;
	}

	public void setInterestRare(Double interestRare) {
		this.interestRare = interestRare;
	}

	public void updateBalance() {
		balance += balance * interestRare;

	}

	@Override /// informa que é uma sobreposicao!
	public void withDraw(double amount) {

		balance -= amount;

	}

}
