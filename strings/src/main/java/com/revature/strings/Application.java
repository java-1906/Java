package com.revature.strings;
 
import java.io.IOException;
import java.util.Scanner;

public class Application {
	public static int sum(int ...nums) {
		int sum = 0;
		
		for (int num: nums) {
			sum += num; 
		}
		
		return sum;
	}
	
	public static void main(String ...args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Hello");
		
		sb2.append(" World");
		
		String sbString = sb.toString();
		String sb2String = sb2.toString();
		
		System.out.println("sb = " + sbString);
		System.out.println("sb2 = " + sb2String);
		
		System.out.println(sb2.charAt(3));
		
		
		String s = "Quintin".toUpperCase();
		
		if (s.equals("QUINTIN")) {
			System.out.println("This is quintin");
		}
		
//		Scanner sc = null;
//		try {
//			sc = new Scanner(System.in);
//			String input = sc.next();
//			System.out.println("You input: " + input);
//		} catch (IOException e) {
//			
//		} finally {
//			sc.close();
//		}
//		
		
		try (Scanner sc = new Scanner(System.in)) {			
			String input = sc.next();
			System.out.println("You input: " + input);
		}
		
		
		// DEAD CODE
//		while(false) {
//			System.out.println("q");
//		}
	
		
		System.out.println(sum());
	}
}










