package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter details of Student 1");

		System.out.print("Enter name:");
		String name1 = sc.nextLine();

		System.out.print("Enter ID:");
		int id1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter department:");
		String dept1 = sc.nextLine();

		int[] marks1 = new int[5];

		System.out.println("Enter 5 marks:");
		for (int i = 0; i < marks1.length; i++) {
			marks1[i] = sc.nextInt();
		}
		sc.nextLine();

		System.out.println("\nEnter details of Student 2");

		System.out.print("Enter name: ");
		String name2 = sc.nextLine();

		System.out.print("Enter ID: ");
		int id2 = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter department: ");
		String dept2 = sc.nextLine();

		int[] marks2 = new int[5];

		System.out.println("Enter 5 marks:");
		for (int i = 0; i < marks2.length; i++) {
			marks2[i] = sc.nextInt();
		}

		Student student1 = new Student(name1, dept1, id1);
		Student student2 = new Student(name2, dept2, id2);

		System.out.println("\nStudent 1 Details");
		student1.printDetails();
		student1.getGrades(marks1);

		System.out.println("\nStudent 2 Details");
		student2.printDetails();
		student2.getGrades(marks2);

		sc.close();

	}

}
