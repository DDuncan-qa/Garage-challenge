package com.qa.main;

public class Motorbike extends Vehicle {
	
	
	@Override
	public int wheels() {
		return 2;
	}

	@Override
	public int seats() {
		return 1;
	}

	@Override
	public String color() {
		return "Navy Blue";	


	}

	@Override
	public String toString() {
		return "Motorbike [wheels()=" + wheels() + ", seats()=" + seats() + ", color()=" + color() + "]";
	}
	
	
	
	public String type() {
		return "Motorbike";
	}
	}

