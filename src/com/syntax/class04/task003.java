package com.syntax.class04;

public class task003 {

	public static void main(String[] args) {
		
		
		int age = 21;
		int weight = 90;
		
		if (age >= 20) {
			System.out.println("You are " + age + " years old");
			if (weight >= 110) {
				System.out.println("Your weight is " + weight + ". You can be a blood donor.");
			}
			else {
				System.out.println("Your weight is below 110 lbs, you cannot be a blood donor.");
			}

		}
		else {
			System.out.println("Your age is below 20, you cannot be a blood donor.");
		}
		

	}

}
