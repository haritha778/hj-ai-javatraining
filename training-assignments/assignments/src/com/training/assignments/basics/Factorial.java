package com.training.assignments.basics;

public class Factorial {

	public static void main(String[] args) {
		// 5! = 1*2*3*4*5 = 120
		
		int a = 5;
		int f = 1;
		
		for(int i = 1; i<=a; i++)
		{
			f*=i;
			
		}
		System.out.println("The factorial of \" "+a+" \" is " +f);

	}

}
