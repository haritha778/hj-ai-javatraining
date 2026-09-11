package com.inter.lamda;

public class Lambdemo {
	public static void main(String[] args) {
		//traditional
		IShape sh = new Square();
		sh.area(10, 20);
		
	//use lambda-provide the implementation
	IShape sha = (x,y)->System.out.println("Square"+(x*y));
	sha.area(10, 10);
	
	
	//rectangle
	IShape rect = (x,y)->System.out.println("rect"+(x*y));
	rect.area(1, 2);
	//triangle
	IShape tri = (x,y)->System.out.println("tri"+(x*y));
	tri.area(20, 40);

}
}
