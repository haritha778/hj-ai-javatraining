package com.training.assignments.basics;

public class Armstrong {

	public static void main(String[] args) {
		
		//1634 ->1^4+6^4+3^4=4^4  (power of number is total no.)
		
		int num = 1634;
		int num1=num;
		
		int sum = 0;
		
		while(num!=0)
		{
			int a = num%10;
			sum +=(a*a*a*a);
			num = num/10;
		}
		
		if(num1==sum)
		{
		System.out.println(sum + " is an Armstrong Number");
		}
		
	}

}
