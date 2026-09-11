package com.training.example;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create 3 num
		int x = 80;
		int y = 10;
		int z = 30;
		
		if(x>y && x>z)
		{
			System.out.println("X is greater");
		}
		else if(y>z)
		{
			System.out.println("Y is greater");
		}
		else
		{
			System.out.println("Z is greater");
		}

//		if (a >= b && a >= c) {
//        System.out.println(a);
//    } else if (b >= a && b >= c) {
//        System.out.println(b);
//    } else {
//        System.out.println(c);
//    }
	}

}
//shortcuts-ctrl+d->delete a line; shift+ctrl+o ->to import the classes; shift+ctrl+f->format the class
