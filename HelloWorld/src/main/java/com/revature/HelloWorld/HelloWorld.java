package com.revature.HelloWorld;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String getUsername() {
		System.out.println("Please enter your name:");
		String username = sc.next();
		return username;
	}
	
	public static Choice getUserChoice() {
		Choice c = null;
		do {
			System.out.println("Please choose:");
			System.out.println("1. Rock");
			System.out.println("2. Scissors");
			System.out.println("3. Paper");
			
			int option = 0;
			try {
				option = Integer.parseInt(sc.next());
			} catch (NumberFormatException e) {
				System.out.println("Not a valid number");
				continue;
			}			
		
			c = getChoice(option);
		} while(c == null);
		
		return c;
	}
	
	public static Choice getChoice(int option) {
		Choice c = null;
		
		switch (option) {
		case 1:
			c = new Rock();
			break;
		case 2:
			c = new Scissors();
			break;
		case 3:
			c = new Paper();
			break;
		default:
			System.out.println("Unknown option");
			break;
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		// Set up the player
		String username = getUsername(); 
		Player p1 = new Player(username, null);
		p1.setChoice(getUserChoice());
		
		// Set up the COM
		int optionNum = new Random().nextInt(2) + 1;
		Choice comChoice = getChoice(optionNum);
		Player cpu = new Player("COM", comChoice);
		System.out.println("Com chooses " + cpu.getChoice().getDisplayName());
		
		int result = p1.getChoice().didWin(cpu.getChoice());
		switch (result) {
		case -1:
			System.out.println("Sorry " + p1.getName() + " you have lost.");
			break;
		case 1:
			System.out.println("Congrats " + p1.getName() + " you have won!");
			break;
		case 0:
			System.out.println(p1.getName() + " you have tied the computer");
			break;
		}
	}
	
}
