package com.syntax.class12;

public class phonesTask {

	public static void main(String[] args) {
		
		phones nokia = new phones();
	
		nokia.brand = "Nokia";
		nokia.model = "3310i";
		nokia.colour = "blue";
		nokia.mass = 160.6;
		nokia.screenType = "keyboard";
		nokia.fullData();
		nokia.reset();
		nokia.clean();
		nokia.update();
		System.out.println();
		
		phones iPhone = new phones();
		
		iPhone.brand = "iPhone";
		iPhone.model = "XS";
		iPhone.colour = "Pink gold";
		iPhone.mass = 130;
		iPhone.screenType = "touchscreen";
		iPhone.fullData();
		iPhone.reset();
		iPhone.clean();
		iPhone.update();
		System.out.println();
		
		phones Pixel = new phones();
		
		Pixel.brand = "Pixel";
		Pixel.model = "3";
		Pixel.colour = "black";
		Pixel.mass = 156.7;
		Pixel.screenType = "touchscreen";
		Pixel.fullData();
		Pixel.reset();
		Pixel.clean();
		Pixel.update();
		System.out.println();
		
		
	}

}
