package com.syntax.class04;

import java.util.Scanner;

public class scannerFunction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = sc.nextLine();
		
		System.out.println("Your name is " + name);
		
		System.out.println("What country do you come from?");
		
		String country = sc.nextLine();
		
		System.out.println("You come from " + country);
		
		System.out.println("How old are you?");
		
		int age = sc.nextInt();
		
		System.out.println("You are " + age + " years old");
		
		if (country.equals("USA")) {
			System.out.println("You speak english");
		}
		else {
			System.out.println("You dont speak english");
		}
		
		System.out.println("Are you a man?");
		
		String man = sc.nextLine();
		
		if(man.equals("yes")) {
			System.out.println("Yes I am a man");
		}
		else {
			System.out.println("No, I am not a man");
		}
		
		
		
	}

}
