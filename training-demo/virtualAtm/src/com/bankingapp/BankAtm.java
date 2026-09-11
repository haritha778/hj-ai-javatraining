package com.bankingapp;

import java.util.Scanner;

public class BankAtm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose \'s\' for savings and \'c\' for current");
		String choice = scanner.next();
		Account account=null;
		if (choice.equalsIgnoreCase("S"))
		//super class ref = sub class object
	      account = new Savings(20000);
		else
		{
			account = new Current(10000, "Current");
			//create a ref of Current and downcast
			
			Current current = (Current) account;//acc is superclass and current is subclass so downcast it
			//call own method of current
			String[] loans = current.showLoanTypes();
			for(String loan : loans)
			{
				System.out.println(loan);
			}
		}
		for(; ;) {
		//call the overridden mthds using ccount ref
		System.out.println(
				"""
				Enter 1.Withdraw
				 2. Deposit
				 3. Balance
				4. exit
				
				""");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Enter Amount to Withdraw");
			double amount = scanner.nextDouble();
			account.withdraw(amount);
			break;
		}
		case 2: {
			System.out.println("Enter Amount to Deposit");
			double amount1 = scanner.nextDouble();
			account.deposit(amount1);
			break;
		}
		case 3: {
			System.out.println("Balance is "+account.getBalance());
			break;
		}
		default:
			scanner.close();
			System.exit(0);;
		}
		
		}	

	}

}
