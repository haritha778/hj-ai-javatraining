package com.bankingapp;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	void withdraw(double amount)
	{
		System.out.println("Deposit in Savings");
		balance -= amount;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit in Savings");
		balance+=amount;
	}
	
	
	

}
