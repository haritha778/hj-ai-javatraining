package com.inter.samples;

public interface IPaymentProcessor {

	String message ="Payment Gateway App";
	//abstract method
	void payAmount(double amount);
	//static mthd can be clled only by interface name
	//common for all implementation classes
	
	static void printReceipt(double amount)
	{
		System.out.println("Recipt for amount paid" +amount);
	}
	
	//default mthd-can be overridden in subclassess
	default void checkOffers() 
	{
		System.out.println("offers on dinning and movies");
	}
}
