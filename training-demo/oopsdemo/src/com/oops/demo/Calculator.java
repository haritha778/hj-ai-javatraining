package com.oops.demo;

public class Calculator {

	void sum (int[] nums)
	{
		//iterrate nums & calculate sum
		
		int sum=0;
		
		for(int num:nums)
		{
			sum+=num;
		}
		System.out.println(sum);
		
	}
	double square(int a)
	{
		//calculate sq using inbuilt mthd of Math class
		return Math.pow(a, 2);
	}
	
}
