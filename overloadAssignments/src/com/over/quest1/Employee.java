package com.over.quest1;

public class Employee {

	String name;
	String designation;

	Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	void calcBonus(double basicAllowance) {
		System.out.println("Employee: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Basic Allowance: " + basicAllowance);
	}

	void calcBonus(double basicAllowance, String gift) {
		System.out.println("Employee: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Basic Allowance: " + basicAllowance);
		System.out.println("Gift: " + gift);
	}

	void calcBonus(double basicAllowance, String gift, double houseAllowance) {
		System.out.println("Employee : " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Basic Allowance : " + basicAllowance);
		System.out.println("Gift : " + gift);
		System.out.println("House Allowance : " + houseAllowance);
	}

}
