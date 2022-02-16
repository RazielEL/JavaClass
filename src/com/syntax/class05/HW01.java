package com.syntax.class05;

	import java.util.Scanner;
	
	public class HW01 {
	      public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Please enter your gender: M of F");
	        String gender = sc.nextLine();

	        System.out.println("Please enter your age");
	        int age = sc.nextInt();

	        if (age > 25) {
	        	if (gender.equals("F")) {
	        		System.out.println("Woman");
	        	}
	        	else {
	        		System.out.println("Man");
	        	}
	        	}
	        if (age < 25) {
	        	if (gender.equals("F")) {
	        		System.out.println("Girl");
	        	}
	        	else {
	        		System.out.println("Boy");
	        	}
	        }

	       

	    }
	}