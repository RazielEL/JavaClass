package com.syntax.class04;

public class nestedIfExcercise {

	public static void main(String[] args) {
		/*
		 * var for allergy, if yes 3 questions, pollen, peanuts, wheat if no you are lucky
		 */
		
		boolean allergy = true;
		String type = "pollen";
		
		
		System.out.println("Do you have any allergies?");
		
		if (allergy == true) {
			System.out.println("Yes, I do");
			System.out.println("Let us check what kind of allergy do you have. ");
			if (type.equals("pollen")){
				System.out.println("I am allergic to pollen");
			}
			else if (type.equals("gluten")){
				System.out.println("I am allergic to gluten");
			}
			else if (type.equals("peanuts")){
				System.out.println("I am allergic to peanuts");
			}
			else {
				System.out.println("Type available type of allergy");
			}
			
		}
		
		else {
			System.out.println("You are lucky");
		}
		
		

	}

}
