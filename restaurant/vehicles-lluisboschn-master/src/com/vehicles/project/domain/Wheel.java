package com.vehicles.project.domain;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		checkWheelDiameter(diameter);
		this.brand = brand;
		this.diameter = diameter;
	}

	private void checkWheelDiameter(double diameter) throws Exception {

		if (diameter <= 0.4 || diameter >= 4)
			throw new Exception("The Wheel diameter is less than 0.4 or more than 4");
	}
}
