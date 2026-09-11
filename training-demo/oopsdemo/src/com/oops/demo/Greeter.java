package com.oops.demo;

public class Greeter {
	
	void printMessage(String...names)
	{
		//iterrate and print the message as "Great Day, PRIYA!!!"
		
		for(String name:names)
		{
			System.out.println("Great Day, "+name.toUpperCase()+"!!!");
		}
	}
	
	void printMessages(String name,String...messages)
	{
		//iterate through message and print as "message 1", +name=> Hello Priya, Welcome Priya, Bye Bye Priya
		
		for (String message:messages)
		{
			System.out.println(message+ ", "+name);
		}
	}
	
	public static void main(String[] args)
	{
		Greeter g = new Greeter();
		g.printMessage("HARITHA","priya","Ram");
		System.out.println();
		g.printMessages("Priya","Hi","Welcome","Bye Bye");
	}

}
