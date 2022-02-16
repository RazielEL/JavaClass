package com.syntax.class04;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Your last name is: " + lastName);
		
		System.out.println("Your full name is: " + name + " " + lastName);
		
		System.out.println("Age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: " + age);
		
		sc.nextLine(); 
		
		System.out.println("Country of origin: ");
		String country = sc.nextLine();
		System.out.println("Your country of origin is: " + country);
		
		

	}

}
