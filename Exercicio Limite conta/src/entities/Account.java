package entities;

import exceptions.BusinessException;

public class Account {

	Integer number;
	String holder;
	Double balance;
	Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {

		amount += balance;
	}

	// a execucao depois do try
	public void withdraw(Double amount) {
		
		validateWithdraw(amount); // chmando a funcao 
		balance -= amount;
	}

	// funcao lanca a excecao se acontecer algum erro se nao faz nada
	private void validateWithdraw(double withdraw) {
		// TESTANDO AS VALIDACOES 
		if (withdraw > getWithdrawLimit()) {

			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		} else if (withdraw > getBalance()) {

			throw new BusinessException("Withdraw error: Not enough balance");

		}
	}

}
