package com.qa.main;

public class Vehicle {
	
	protected int length;
	protected String colour;
	
	public String makeNoise() {  // -> method
		return "Rvvvvv";
		
		
	}
	
	public String type() {
		return "Vehicle";
	}
	
	public String toString() {
		return "Vehicle [length=" + length + ", colour=" + colour + "]";
	}

	public int wheels() {
		
		return 0;
	}

	public int seats() {
		
		return 0;
	}

	public String color() {
		
		return "";
	}

}
