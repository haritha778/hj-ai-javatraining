package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	static void processEmployee(Employee employee) {

		if (employee.designation.equalsIgnoreCase("Programmer")) {

			employee.calcBonus(5000);

		} else if (employee.designation.equalsIgnoreCase("Manager")) {

			employee.calcBonus(10000, "Gift Voucher");

		} else if (employee.designation.equalsIgnoreCase("Director")) {

			employee.calcBonus(15000, "Gold Watch", 20000);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee[] employees = new Employee[3];

		for (int i = 0; i < employees.length; i++) {

			System.out.print("Enter name: ");
			String name = sc.nextLine();

			System.out.print("Enter designation: ");
			String designation = sc.nextLine();

			employees[i] = new Employee(name, designation);
		}

		for (Employee employee : employees) {
			processEmployee(employee);
		}

		sc.close();
	}

}
