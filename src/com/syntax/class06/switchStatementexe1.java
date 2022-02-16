package com.syntax.class06;

public class switchStatementexe1 {

	public static void main(String[] args) {
		
		char choice = 'm';
		String answer;
		
		switch (choice) {
		case 'y': answer = "Yes";
		break;
		case 'n': answer = "No";
		break;
		case 'm': answer = "Maybe";
		break;
		default: answer = "bleh";
		}
		
		System.out.println(answer);

		
		System.out.println("--------------------------------------------");
		
		String car = "Toyota";
		String country;
		
		switch (car) {
		case "Toyota": country = "Japan";
		break;
		case "BMW" : country = "Germany";
		break;
		case "Tesla" : country = "USA";
		break;
		case "Renault" : country = "France";
		break;
		default: country = "WORLD";
		}
		System.out.println(country);
	}

}
