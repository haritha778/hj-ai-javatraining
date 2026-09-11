package com.inter.samples;

public abstract class CardPayment implements IPaymentProcessor{
	
	void cardType(String type)
	{
		System.out.println("Card limit is upto" +type);
	}
	
}

//default class
class CreditCardPayment extends CardPayment
{

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying through credit card"+amount);
	}
	
	//concrete mthd
	void cardLimt(double amount)
	{
		System.out.println("Card limit is raised to "+amount);
	}
	
}

class DebitCardPayment extends CardPayment
{

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying through debit card"+amount);
	}
	
	
	public void checkOffers() 
	{
		System.out.println("offers only on purchase above 5000");
	}

	
}


