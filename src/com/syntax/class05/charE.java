package com.syntax.class05;

public class charE {

	public static void main(String[] args) {
		
		
		int score = 80;
		char grade;
		
		if (score == 100) {
			grade = 'A';
		}
		else if (score == 80) {
			grade = 'B';
		}
		else if (score == 50) {
			grade = 'C';
	}
		else {
			grade = 'F';
		}
	
		
		System.out.println("Your grade is " + grade);
	}
}
