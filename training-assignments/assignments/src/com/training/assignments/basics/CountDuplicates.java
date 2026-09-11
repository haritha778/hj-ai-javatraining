package com.training.assignments.basics;

public class CountDuplicates {

	public static void main(String[] args) {
		
		int [] arr = {10,5,10,6,8,6,8,5,10};
		
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

}
