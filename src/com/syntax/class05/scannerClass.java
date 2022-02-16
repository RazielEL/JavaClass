package com.syntax.class05;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		
		System.out.println("Your name is " + name + " and your age is " + age);
		
		System.out.println("Please enter boolean value");
		boolean booleanValue = sc.nextBoolean();
		System.out.println(booleanValue);
		
		System.out.println("Please enter double value");
		double a = sc.nextDouble();
		System.out.println(a);
		
		System.out.println("Please enter char");
		char b = sc.next().charAt(0);
		System.out.println(b);
		
		sc.nextLine();
		
		System.out.println("Enter your city");
		String city = sc.nextLine();
		System.out.println("Your city is " + city);
	}

}
