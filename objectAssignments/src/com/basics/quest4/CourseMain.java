package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Training training = new Training();

		String[] trainers = new String[2];
		System.out.println("Enter trainer names:");

		for (int i = 0; i < trainers.length; i++) {
			trainers[i] = sc.nextLine();
		}

		System.out.println("Trainer Details:");
		training.showTrainers(trainers);

		System.out.println("Default Trainers:");
		training.showTrainers("Rohan", "Sathya");

		
		
		String[] courses = training.showCourses();
		System.out.println("Course Details:");

		for (String course : courses) {
			System.out.println(course);
		}

		sc.close();

	}

}
