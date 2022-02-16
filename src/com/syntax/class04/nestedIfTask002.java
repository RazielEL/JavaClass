package com.syntax.class04;

public class nestedIfTask002 {

	public static void main(String[] args) {
	
		double mortgageRate = 2d;
		double mortgagePrice = 30000d;
		
		
		if (mortgageRate > 4.5) {
			System.out.println("I will not buy a house");
		}
		else {
			System.out.println("I will buy a house");
			if (mortgagePrice > 50000) {
				System.out.println("I will take a loan");
			}
			else {
				System.out.println("I will pay cash");
			}
				
		}

	}

}
