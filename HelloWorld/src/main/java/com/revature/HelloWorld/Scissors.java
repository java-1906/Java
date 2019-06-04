package com.revature.HelloWorld;

public class Scissors extends Choice {
	public Scissors() {
		displayName = "Scissors";
	}
	

	public int didWin(Choice c) throws IllegalArgumentException {
		if (c instanceof Paper) {
			return 1;
		} else if (c instanceof Scissors) {
			return 0;
		} else if (c instanceof Rock) {
			return -1;
		}
		
		throw new IllegalArgumentException();
	}
}
