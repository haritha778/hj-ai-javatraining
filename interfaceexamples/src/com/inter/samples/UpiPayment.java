package com.inter.samples;

public class UpiPayment implements IPaymentProcessor {

	@Override
	public void payAmount(double amount) 
	{
		System.out.println("Paying amount"+amount+"using UPI");

	}

	@Override
	public void checkOffers() 
	{
		System.out.println("10% discount of Dinning and Shopping");
		//IPaymentProcessor.super.checkOffers(); ->this calls super o/p
	}

	public void transcationStatus() 
	{
		System.out.println("Checking status...");
	}
}
