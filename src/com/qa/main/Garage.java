package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List <Vehicle> vehicle = new ArrayList<>();
	
	
	
	public void calculateBill() {
		
		for ( Vehicle i : vehicle ) {
		
			int bill = 0;
		
			switch(i.type()) {
				case "Car": 
					bill = 2 * i.wheels() * i.seats();
					break;
				case "Motorbike": 
					bill = 1 * i.wheels() * i.seats();
					break;
				case "Bus": 
					bill = 4 * i.wheels() * i.seats();
					break;
			}
		
			System.out.println(i + " Bill: £" + bill);
		
		}
		
	}
	  // Remove a vehicle
		public void removeByType(String type) {     //Removing a string
			
			vehicle.removeIf( i -> ( i.type()==(type) ) );   //i is an index
			
			System.out.println(vehicle);
		
		}
			// Fix a vehicle
			public void fixByType(String type) {
				
				for ( Vehicle i : vehicle ) {
					
					int bill = 0;
					
					if(i.type()==(type)) {
						bill = i.seats() * i.wheels();
						System.out.println(i + " Bill: £" + bill);
					} 
					
				}
				
				
			}
				// Empty vehicle
				public void emptyGarage() {
					
					vehicle.clear();
					
					System.out.println("Garage is empty! " + vehicle);
			
				
				
				}
		
		}
		
	
		
		




