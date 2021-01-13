package com.qa.main;

public class Bus extends Vehicle{
	
	@Override
	public int wheels() {
		return 4;
	}

	@Override
	public int seats() {
		return 100;
	}

	@Override
	public String color() {
		return "red";	
		
	}

	@Override
	public String toString() {
		return "Bus [wheels()=" + wheels() + ", seats()=" + seats() + ", color()=" + color() + "]";
	}



	
	public String type() {
		return "Bus";
	}
}
