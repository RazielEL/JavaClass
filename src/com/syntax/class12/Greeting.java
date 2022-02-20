package com.syntax.class12;

public class Greeting {

	void hello(String name) {
		System.out.println("Hello, " + name);
	}
	
	void hello2(String name2, int j) {
		
		for (int i = 1; i <= j; i++) {
			System.out.println("Whazaaa " + name2);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Greeting greetings = new Greeting();
		
		greetings.hello("Amanda");
		greetings.hello2("Doug", 10);

	}

}
