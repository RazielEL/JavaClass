package com.syntax.class0708;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare a variable to store a price for a coffee. Ask user to pay for a coffee. 
		// Keep asking to pay for coffee until user enters exact amount . If user give more 
		// than $3 --> ask them to give less, if user gives less money then ask to give more. 
		// Once user got a write amount print “Please enjoy your candy”
		
		
		String a = "Pay for coffee";
		String b = "Give me less";
		String c = "Give me more";
		int pay = 0;
		System.out.println(a);
		do {
			
			pay = sc.nextInt();
			if (pay < 3) {
				System.out.println(c);
			}
			else if (pay > 3) {
				System.out.println(b);
			}
		} while ( pay != 3);
		
		if ( pay == 3) {
			System.out.println("Please enjoy your candy");
		}
		
		
		
		
		
	}

}
