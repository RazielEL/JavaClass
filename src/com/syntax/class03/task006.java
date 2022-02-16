package com.syntax.class03;

public class task006 {

	public static void main(String[] args) {
		
		// I am assuming that 0 is an even number, according to the math rules.
		
		
		// method 1
		
		int a = 330 ;
		
		String b = (a%2==0) ? (a + " is an even number") : (a + " is not an even number");
		
		System.out.println(b);

		// method 2

		int c = 50;
		
		if (c%2==0) {
			System.out.println(c + " is an even number");
		}
		else {
			System.out.println(c + " is not an even number");
		}

	}

}