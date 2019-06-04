package com.revature.HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		//Player p1 = new Player();
		Rock r = new Rock();
		Paper p = new Paper();
		int res = 0;
		try {			
			res = r.didWin(p);
		} catch (Exception e) {
			
		}
		System.out.println(res);
	}
	
}
