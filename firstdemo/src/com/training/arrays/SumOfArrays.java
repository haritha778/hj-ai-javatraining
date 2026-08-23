package com.training.arrays;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//throws NullPointerException
//		int[] nums = null;
//		nums[0] = 100;

		int [] nums = new int[4];
//		System.out.println(nums.length); //4
//		System.out.println(nums[3]);//0
//		System.out.println(nums[4]);//throws ArrayIndexOutofBiundException
//		
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		
		int sum =0;
		
		//forloop
		for(int i=0; i<nums.length; i++)
		{
			int val = nums[i];
			sum += val;
		}
		
		System.out.println(sum);
		
		//foreach
		int total=0;
		for(int num:nums)
		{
			//total = total+num;
			total+= num;
		}
		
		System.out.println(total);
		
		
		//String 
		String[]names = new String[] {"abi","priya"};
		for(String name:names)
		{
			System.out.println(name.toUpperCase());
		}
	}
	
	

}

//package com.firstProject.basics;
//public class arrayDemo 
//{
//public static void main(String[] args) 
//{
//int[] num = {10, 20, 30, 40};
//int sum = 0;
//for (int i = 0; i<num.length; i++)
//{
// sum += num[i];
//}
//System.out.println("The sum of array is " + sum);
//}
//}

