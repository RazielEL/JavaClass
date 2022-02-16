package com.syntax.class0708;
import java.util.Scanner;
public class loopsTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Please give me your name");
			String name = sc.nextLine();
			System.out.println("Please give me your last name");
			String lastName = sc.nextLine();
			System.out.println("Please give me your age");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Your name is " + name + " " + lastName + " and you are " + age + " years old");
		}
		
		
		

	}

}
