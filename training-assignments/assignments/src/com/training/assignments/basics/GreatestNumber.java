package com.training.assignments.basics;

public class GreatestNumber {

	public static void main(String[] args) {
		
//		1->i/p -> [10,2,40,5,30]
//		2->o/p -> 40
//		3->comparison is done here
//		4->since it is array iteration happens so for loop
		
		int [] arr = {10,2,40,5,30};
		
		int max = arr[0];						//10 [assume the 1st element as max and compare with other elements]
		
		for(int i=1;i<arr.length;i++)			//1<5,2<5,3<5,4<5,5!<5
		{
			if(max < arr[i])					//10<2,10<40,40<5,40<30
			{
			max = arr[i];						//max=f,40,f,f
			}
		}
		System.out.println(max + " is the Greatest Number in the given array");		//40
	}
}
