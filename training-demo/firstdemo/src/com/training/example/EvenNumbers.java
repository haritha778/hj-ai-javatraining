package com.training.example;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find even num b/w 1-20
		
		for(int i=0; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "is even");
			}
		}
		
		System.out.println();
		
		for(int i=0; i<=20; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i + "is odd");
			}
		}
		

	}

}


