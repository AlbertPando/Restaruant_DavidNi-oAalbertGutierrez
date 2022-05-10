package com.vehicles.project.domain;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addOneWheel(frontWheels);
		addOneWheel(backWheels);
	}

	public int getNumFrontWheels() {
		return 1;
	}

	public int getNumBackWheels() {
		return 1;
	}
}
