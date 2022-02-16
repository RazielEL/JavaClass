package com.syntax.class03;

public class equalOperator {
	
	public static void main(String[] args) {
		

		String h = "Chrome";
		
		if (h == "Chrome") {
			System.out.println("We are executing tests on chrome");
		}
		else{
			System.out.println("I am not executing any test cases");
		}
			
		
		System.out.println();
		
		
		if (h.equals("Chrome")) {
			System.out.print("We are executing tests on chrome");
		}
		else{
			System.out.println("I am not executing any test cases");
		}
		
	
}
}
