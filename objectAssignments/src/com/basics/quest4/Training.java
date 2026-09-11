package com.basics.quest4;

public class Training {

	String[] showCourses() {

		String[] courses = { "Java", "Spring Boot", "SQL", "Microservices" };

		return courses;
	}

	void showTrainers(String... names) {

		for (String name : names) {
			System.out.println(name);
		}
	}

}
