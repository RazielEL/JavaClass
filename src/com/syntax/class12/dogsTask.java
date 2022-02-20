package com.syntax.class12;

public class dogsTask {

	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	void run() {
		System.out.println(name + " is running");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void bark() {
		System.out.println(name + " is barking");
	}
	void fullData() {
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}
	
	public static void main(String[] args) {
		
		dogsTask husky = new dogsTask();
		
		husky.name = "Scrappy";
		husky.color = "Brown";
		husky.breed = "Husky";
		husky.gender = 'M';
		husky.age = 4;
		husky.weight = 30;
		husky.run();
		husky.eat();
		husky.bark();
		husky.fullData();
		System.out.println();
		
		dogsTask bulldog = new dogsTask();
		
		bulldog.name = "Winston";
		bulldog.color = "White";
		bulldog.breed = "Bulldog";
		bulldog.gender = 'M';
		bulldog.age = 8;
		bulldog.weight = 20;
		bulldog.run();
		bulldog.eat();
		bulldog.bark();
		bulldog.fullData();
		System.out.println();
		
		dogsTask labrador = new dogsTask();
		
		labrador.name = "Ata";
		labrador.color = "Yellow";
		labrador.breed = "labrador";
		labrador.gender = 'F';
		labrador.age = 2;
		labrador.weight = 15;
		labrador.run();
		labrador.eat();
		labrador.bark();
		labrador.fullData();
		System.out.println();
		
		
	}

}
