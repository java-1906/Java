package com.revature.HelloWorld;

public class Paper extends Choice {
	public Paper() {
		displayName = "Paper";
	}
	

	public int didWin(Choice c) throws IllegalArgumentException {
		if (c instanceof Paper) {
			return 0;
		} else if (c instanceof Scissors) {
			return -1;
		} else if (c instanceof Rock) {
			return 1;
		}
		
		throw new IllegalArgumentException();
	}
}
