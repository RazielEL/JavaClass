package com.syntax.class0708;
import java.util.Scanner;
public class loopsFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Do you want to apply for a credit card? Yes/No");
			answer = sc.nextLine();
		} while (!answer.equalsIgnoreCase("yes"));
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Here you are.");
		}
		
		

	}

}
