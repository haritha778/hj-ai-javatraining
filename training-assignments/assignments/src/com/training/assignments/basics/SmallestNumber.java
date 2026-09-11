package com.training.assignments.basics;

public class SmallestNumber {

	public static void main(String[] args) {
		
		int [] arr = {10,2,40,5,30};
		int min = arr[0];						//10
		
		for(int i = 1; i<arr.length; i++)		//1,2,3,4
		{
			if(min > arr[i])					//10>2,2>40,2>5,2>30
			{
				min = arr[i];					//2,f,f,f
			}
		}
		System.out.println(min + " is the Smallest Number in the given array");
	}

}
