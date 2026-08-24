package com.training.assignments.basics;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 123;
		
		int rev = 0;
		
		while(num!=0)
		{
			int a = num%10;
			rev = rev *10 + (a);
			num = num/10;
		}
		
		System.out.println("The Reversed Number is " + rev);
		
	}

}
