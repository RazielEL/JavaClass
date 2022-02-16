package com.syntax.class05;
import java.util.Scanner;
public class task {

	public static void main(String[] args) {
		
		System.out.println("What day is today?");
		Scanner sc = new Scanner(System.in);
		
		String day = sc.nextLine();
		
		if (day.equalsIgnoreCase("Monday") || day.equals("Friday")) {
			System.out.println(" There is no class today");
		}
		
		else if (day.equalsIgnoreCase("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today we have Manual Testing Class");
		}
		else if (day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
				System.out.println("Today we have Java Class");
		}
		else {
			System.out.println("Incorrect day");
		}
		
		
	}
}
