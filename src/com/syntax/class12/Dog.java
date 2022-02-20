package com.syntax.class12;
import java.util.Scanner;
public class Dog {
	
	// attributes, field, properties
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	// behaviours, functions, methods
	void barks() {
		System.out.println("Dog is barking...");		
	}
	void eat() {
		System.out.println("Dog is eating ");
	}
	void sleep() {
		System.out.println("Dog is sleeping ");
	}
	
	
	
	public static void main(String[] args) {
		
		// to call it we write name of the class, any variable name (small case), = new, repeat name of the class and ();
		// object creation from the class. Creating object Scooby, from the Dog class.
		Dog scooby = new Dog();
		// Dog - class, Scooby - object, = operator, new is a keyword that we use to create. Dog() we are calling the constructor of the class
		Scanner sc = new Scanner(System.in);
		scooby.barks();
		scooby.eat();
		scooby.sleep();
		
		

	}

}
