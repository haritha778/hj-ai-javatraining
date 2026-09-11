package com.inher.quest3;

import java.util.Scanner;

public class OverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Cube");
		System.out.println("2. Cuboid");
		System.out.println("3. Oval");
		System.out.println("4. Cylinder");

		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter x: ");
		int x = sc.nextInt();

		System.out.print("Enter y: ");
		int y = sc.nextInt();

		Figures figure;

		if (choice == 1) {
			figure = new Cube();

		} else if (choice == 2) {
			figure = new Cuboid();

		} else if (choice == 3) {
			figure = new Oval();

		} else if (choice == 4) {
			figure = new Cylinder();

		} else {
			System.out.println("Invalid choice");
			sc.close();
			return;
		}

		figure.volume(x, y);
		sc.close();

	}

}
