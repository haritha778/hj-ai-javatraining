package com.bankingapp;

public class Current extends Account {

	String accountType;
	public Current(double balance, String accountType) {
		super(balance);
		this.accountType = accountType;
	}
	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		balance=balance-amount-100;
	}
	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		balance=balance+amount+50;
	}
	
	//owm method of the current class
	String [] showLoanTypes()
	{
		return new String[] {"short term", "long term", };
	}

//	String accountType;
//	
//	Current(String accType, double balance)
//	{
//		super(balance);
//		accountType = accType;
//	}
	
}
