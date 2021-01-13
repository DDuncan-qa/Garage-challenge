package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle car1 = new Car();
		Vehicle motorBike1 = new Motorbike();
		Vehicle bus1 = new Bus();
		
		System.out.println(vehicle1.makeNoise());
		System.out.println(car1.makeNoise());
		System.out.println(motorBike1.makeNoise());
		
		Garage g = new Garage();
		
		g.vehicle.add(car1);
		g.vehicle.add(motorBike1);
		g.vehicle.add(bus1);
		
		System.out.println(car1);
		System.out.println(motorBike1);
		System.out.println(bus1);
		g.calculateBill();
		g.removeByType("Motorbike");
		g.fixByType("Bus");
		g.emptyGarage();
	}
	

}
