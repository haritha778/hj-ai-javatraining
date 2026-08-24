package com.training.assignments.basics;

public class Fibonacci {

	public static void main(String[] args) {
		
		//0,1,1,2,3...100---> sum of the 1st and 2nd nos is 3rd no.
		
		int a=0;
		int b=1;
		while(a<=100)
		{
			System.out.print(a + " ");
			
			int c = a+b;
			a=b;
			b=c;
			
		}
		
	}

}
