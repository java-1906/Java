package com.revature.cars;

public class Car extends Vehicle {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1665394909239973415L;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(float odometer, int eco) {
		super(odometer, eco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Vroom");
	}
	
	
}
