package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		// (1st way)
		int age = 25; // declares variable and initialize 
		System.out.println("My age is - " + age);
		
		
		// (2nd way)
		int num;	//declare
		num = 25;  // initialize 
		// na chuj tak, bez sensu.
		System.out.println("My num is - " + num);
		
		
		// 3rd way, initialize all variables at once.
		int n1, n2, n3; //ini 1 2 3 at once
		n1 = 1;
		n2 = 2;
		n3 = 3;
		
		System.out.println("My n1 is - " + n1);
		System.out.println("My n2 is - " + n2);
		System.out.println("My n3 is - " + n3);
		
		age = 26;
		System.out.println("My age is - " + age);
		 
		
		
	}

}
