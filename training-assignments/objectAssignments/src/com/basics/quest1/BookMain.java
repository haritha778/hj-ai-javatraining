package com.basics.quest1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter book title: ");

		String title = sc.nextLine();

		System.out.print("Enter author: ");

		String author = sc.nextLine();

		System.out.print("Enter price: ");
		double price = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter category: ");

		String category = sc.nextLine();

		Book book1 = new Book(title, author, price, category);

		System.out.println("\nBook Details");
		book1.getDetails();
		book1.checkBookType();

		sc.close();

	}

}
