package com.over.quest2;

public class Messenger {

	void sendMail(String message) {
		System.out.println("Message: " + message);
	}

	void sendMail(String tousername, String message) {
		System.out.println("To: " + tousername);
		System.out.println("Message: " + message);
	}
	
	void sendMail(String tousername, String message,String subject)
	{
		System.out.println("To: " + tousername);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
	}
}
