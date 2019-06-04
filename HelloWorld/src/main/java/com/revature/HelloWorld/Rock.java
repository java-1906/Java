package com.revature.HelloWorld;

public class Rock extends Choice {
	
	public Rock() {
		displayName = "Rock";
	}
	
	public int didWin(Choice c) throws IllegalArgumentException {
		if (c instanceof Paper) {
			return -1;
		} else if (c instanceof Scissors) {
			return 1;
		} else if (c instanceof Rock) {
			return 0;
		}
		
		throw new IllegalArgumentException();
	}
}
