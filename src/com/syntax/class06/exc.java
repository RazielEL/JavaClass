package com.syntax.class06;
import java.util.Scanner;
public class exc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String country = "GeRmAnY";
		String lang;
		
		switch (country.toLowerCase()) {
		case "USA" : lang = "English";
		break;
		case "germany" : lang = "Deutch";
		break;
		case "Poland" : lang = "Polski";
		break;
		case "Russian" : lang = "Rosyjski";
		break;
		case "Finland" : lang = "Suomi";
		break;
		default : lang = "word";
		
		}
		
		System.out.println("Citizens of " + country + " speak " + lang);
		
		
	}

}
