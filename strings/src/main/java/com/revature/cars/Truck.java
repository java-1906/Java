package com.revature.cars;

public class Truck extends Vehicle {

	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(float odometer, int eco) {
		super(odometer, eco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Truck Truck Truck!!!");
	}
	
	
	public void move(int i) {
		String msg = ("Truck Moves " + i) + "miles";
		System.out.println(msg);
	}
	
	

}
