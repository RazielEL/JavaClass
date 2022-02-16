package com.syntax.class04;

public class nestedIfTask001 {
	
	public static void main(String[] args) {
		
		System.out.println("Do you have a diploma?");
		
		boolean diploma = false;
		boolean degree = true;
		double gpa = 2.0d;
		
		if (diploma == true){
		System.out.println("I do have a diploma");
		}
		
		else {
			System.out.println("I do not have a diploma");
		}
		
		
				//// to co wyzej to ja sobie sam dodalem
		
		
		if (diploma == true) {
			System.out.println("Congratulations!");	
		}
		else {
			System.out.println("Get a degree program.");
			if (degree == true) {
				if (gpa < 3.5) {
				System.out.println("Your GPA is equall to " + gpa + ". You should study harder.");
				}
				else {
				System.out.println("Your GPA is equall to " + gpa + ". You are eligible for scholarship");
			}
			}
		}
		}
}
