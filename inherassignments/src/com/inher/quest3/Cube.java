package com.inher.quest3;

public class Cube extends Figures {

	@Override
	void volume(int x, int y) {
		int answer = x * x * x;
		System.out.println("Volume of cube : " + answer);
	}

}
