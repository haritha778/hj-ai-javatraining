package com.inher.quest1;

public class CompanyMain {

	public static void main(String[] args) {

		Project project = new TeamOne();
		project.doTask();

		TeamOne teamOne = (TeamOne) project;
		teamOne.softwaresUsed("Eclipse", "Jenkins", "Maven");

		Project project1 = new TeamTwo();
		project1.doTask();

		TeamTwo teamTwo = (TeamTwo) project1;
		String[] techStack = teamTwo.getTechStack();

		for (String tech : techStack) {
			System.out.println(tech);
		}

	}

}
