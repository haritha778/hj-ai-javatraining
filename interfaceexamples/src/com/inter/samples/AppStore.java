package com.inter.samples;

public class AppStore {

	public static void main(String[] args) {
		// interface ref = implementation class
		
		IPaymentProcessor paymentProcessor = new UpiPayment();
		paymentProcessor.payAmount(1000);
		paymentProcessor.checkOffers(); //overriden default mthd in upipayment
		
		IPaymentProcessor.printReceipt(1000);//static mthd using interface
		System.out.println(IPaymentProcessor.message);//call ststic variable
		
		//own mthd of upipayment
		UpiPayment upipayment = (UpiPayment) paymentProcessor;
		upipayment.checkOffers();//print from upipayment
		System.out.println();
		
		//card payment
		paymentProcessor = new CreditCardPayment();
		paymentProcessor.checkOffers();//calls from interface

		long x=100;
		int y =(int)x;
		
		CreditCardPayment credit =(CreditCardPayment) paymentProcessor;
		//all mthds in credit card
		credit.cardLimt(20000);
		//super class mthd
		credit.cardType("VISA");
		//call interface mthd
		credit.payAmount(4500);
		//defaut
		credit.checkOffers();//print from interface
		
		paymentProcessor = new DebitCardPayment();
		paymentProcessor.payAmount(3000);
		paymentProcessor.checkOffers();//calls from debitcardpayment
		
	}

}
