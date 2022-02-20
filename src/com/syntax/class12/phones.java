package com.syntax.class12;

public class phones {
	
	
	String brand;
	String model;
	String screenType;
	double mass;
	String colour;
	
	
	void reset() {
		System.out.println("You should reset your " + colour + " " + brand + " phone daily");
	}
	
	void update() {
		System.out.println("You should update your " + brand + " " + model + " phone monthly.");
	}
	
	void clean() {
		System.out.println("You should clean your " + screenType + " of your " + brand + " phone at least once a day.");
	}
	void fullData() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Screen type: " + screenType);
		System.out.println("Weight: " + mass);
		System.out.println("Colour: " + colour);
		
	}
	
}
