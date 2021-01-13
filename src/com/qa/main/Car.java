package com.qa.main;

public class Car extends Vehicle {
	
	@Override
	public String makeNoise() {  // -> method
		return "Skrr";
	}	
		@Override
		public int wheels() {
			return 4;
		}

		@Override
		public int seats() {
			return 5;
		}

		@Override
		public String color() {
			return "black";	 
			
	

}
		@Override
		public String toString() {
			return "Car [wheels()=" + wheels() + ", seats()=" + seats() + ", color()=" + color() + "]";
		}
		
		public String type() {
			return "Car";
		}

	}