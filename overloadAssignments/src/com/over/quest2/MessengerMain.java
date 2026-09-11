package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) {

		Messenger messenger = new Messenger();

		messenger.sendMail("Hello,hru?");
		System.out.println();

		messenger.sendMail("Ram", "Interview Scheduled");
		System.out.println();

		messenger.sendMail("Priya", "Please update phoneNumber", "Update Details");

	}

}
