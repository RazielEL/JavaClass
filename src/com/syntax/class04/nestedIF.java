package com.syntax.class04;
import java.util.Scanner;

public class nestedIF {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Did you take the vaccine? y/n");
		char vaccine = sc.next().charAt(0);
		
		if (vaccine=='n') {
			System.out.print("Do you have a negative PCR test? y/n");
			char pcr = sc.next().charAt(0);
			if (pcr == 'n') {
				System.out.print("Did you have covid recently? y/n");
				char covid = sc.next().charAt(0);
				if (covid == 'y') {
					System.out.print("You can come in!");
				}
				else {
					System.out.println("You cant come in");
				}
			}
			else {
				System.out.println("Is it negative? y/n");
				char test = sc.next().charAt(0);
				if (test == 'y') {
					System.out.println("You can come in");
				}
				else {
					System.out.println("You cannot come in");
				}
				
			}
		}
		    
		else {
			System.out.println("How many doses do you have? ");
			int dose = sc.nextInt();
			if ((dose > 3) || (dose < 0)) {
				System.out.println("You are a liar.");
			}
			else if (dose == 0) {
				System.out.println("You are not vaccinated, you cannot come in");
			}
			else {
				if (dose==1) {
						System.out.println("You are partially vaccinated, do not come in");
				}
				else {
					System.out.println("You are fully vaccinated, please come in");
				}
			}
		}
	
	}

}
