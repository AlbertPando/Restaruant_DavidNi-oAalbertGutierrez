package com.vehicles.project.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		checkPlate(plate);
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	private void checkPlate(String plate) throws Exception {
		int plateNumbers = countPlateNumbers(plate);
		int plateLetters = countPlateLetters(plate);
		if (plateNumbers != 4)
			throw new Exception("There are no 4 numbers in the plate");
		if (plateLetters == 2 || plateLetters == 3)
			throw new Exception("There are not 2 or 3 letters in the plate");
	}

	private int countPlateNumbers(String plate) {
		int numbers = 0;
		for (int i = 0; i < plate.length(); i++) {
			if (Character.isDigit(plate.charAt(i))) {
				numbers++;
			}
		}
		return numbers;
	}

	private int countPlateLetters(String plate) {
		int letters = 0;
		for (int i = 0; i < plate.length(); i++) {
			if (!Character.isDigit(plate.charAt(i))) {
				letters++;
			}
		}
		return letters;
	}

	public abstract void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception;

	public abstract int getNumFrontWheels();

	public abstract int getNumBackWheels();

	protected void addOneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel wheel = wheels.get(0);
		this.wheels.add(wheel);
	}

	protected void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	public void setColor(String color) {
		this.color=color;
	}

	public String getPlate() {
		return plate;
	}
}
