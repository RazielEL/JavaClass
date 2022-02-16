package com.syntax.class05;
import java.util.Scanner;
public class HW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TASK 01
		
		System.out.println("Choose a number from 1 to 1000");
		
		int num = sc.nextInt();
		
		if (num >=1 && num <= 10) {
			System.out.println("Number is small");
		}
		else if (num >=11 && num <= 100) {
			System.out.println("Number is medium");
		}
		else if (num >=101 && num <= 1000) {
			System.out.println("Number is large");
		}
		else
			System.out.println("You were supposed to choose a number from 1 to 1000!");
		
		
		// TASK 02
		
		System.out.println("Enter current time in format 00, 24h");
		
		int time = sc.nextInt();
		
		if (time >=1 && time <= 11) {
			System.out.println("Morning");
		}
		else if (time >= 12 && time <= 15) {
			System.out.println("Afternoon");
		}
		else if (time >=16 && time <= 20) {
			System.out.println("Evening");
		}
		else if (time >=21 && time <= 24) {
				System.out.println("Night");
		}
		else
			System.out.println("You were supposed to choose a time from 1 to 24");
		
		// TASK 03
		
		System.out.println("Input score of quiz from 0 to 100");
		int quiz = sc.nextInt();
		
		System.out.println("Input score of mid term");
		int mid = sc.nextInt();
		
		System.out.println("Input score of final");
		int fin = sc.nextInt();
		
		int avg = (quiz + mid + fin) / 3;
		
		if (avg >= 90) {
			System.out.println("Grade A");
		}
		else if (avg >= 70 && avg < 90) {
			System.out.println("Grade B");
		}
		else if (avg >=50 && avg < 70) {
			System.out.println("Grade C");
		}
		else if (avg < 50) {
				System.out.println("Grade F");
		}
		else
			System.out.println("Incorrect score input");
		
		// TASK 04
		
		System.out.println("Gimme month of birth, 1 - 12");
		int birth = sc.nextInt();
		
		if (birth == 3 || birth == 4 || birth == 5) {
			System.out.println("Spring");
		}
		else if (birth == 6 || birth == 7 || birth == 8) {
			System.out.println("Summer");
		}
		else if (birth == 9 || birth == 10 || birth == 11) {
			System.out.println("Autumn");
		}
		else if (birth == 12 || birth == 1 || birth == 2 ) {
			System.out.println("Winter");
		}
		else {
			System.out.println("Wrong input");
		}
		
		
	}

}

