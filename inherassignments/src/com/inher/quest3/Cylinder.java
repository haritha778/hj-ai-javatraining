package com.inher.quest3;

public class Cylinder extends Figures {

	@Override
	void volume(int x, int y) {
		double ans = Math.PI * x * x * y;
		System.out.println("Volume of Cylinder: " + ans);
	}

}
