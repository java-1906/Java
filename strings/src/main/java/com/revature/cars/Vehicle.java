package com.revature.cars;

import java.io.Serializable;

abstract public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3727871019667092234L;
	protected float odometer;
	protected int eco;
	
	public Vehicle() {
	}

	public Vehicle(float odometer, int eco) {
		super();
		this.odometer = odometer;
		this.eco = eco;
	}

	public abstract void move();
	
	public float getOdometer() {
		return odometer;
	}

	public void setOdometer(float odometer) {
		this.odometer = odometer;
	}

	public int getEco() {
		return eco;
	}

	public void setEco(int eco) {
		this.eco = eco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eco;
		result = prime * result + Float.floatToIntBits(odometer);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (eco != other.eco)
			return false;
		if (Float.floatToIntBits(odometer) != Float.floatToIntBits(other.odometer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [odometer=" + odometer + ", eco=" + eco + "]";
	}	
}
