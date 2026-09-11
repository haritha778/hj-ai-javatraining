package com.basics.quest3;

public class Student {

	String name;
	String department;
	int id;

	public Student(String name, String department,int id) {
		this.name = name;
		this.department = department;
		this.id = id;
	}

	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("ID: " + id);
	}

	public String getGrades(int[] marks) {

		int sum = 0;

		for (int mark : marks) {
			sum = sum + mark;
		}

		double average = (double) sum / marks.length;

		String grade;

		if (average >= 90 && average <= 100) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else if (average >= 50) {
			grade = "E";
		} else {
			grade = "Fail";
		}

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Grade: " + grade);

		return grade;
	}
}
