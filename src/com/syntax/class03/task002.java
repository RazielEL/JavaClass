package com.syntax.class03;

public class task002 {

	public static void main(String[] args) {
		/// TASK 1 DOUBLE COMPARISON
		
		
		double a = 100;
		double b = 200;
		
		boolean c = (a>b);
		
		if (c) {
			System.out.println("Double value " + a + " is greater than double value " + b);
		}
		else {
			System.out.println("Double value " + b + " is greater than double value " + a);
		}
		
		//// TASK 2 TEMPERATURE CHECK
		
		int temp = 20;
		
		boolean d = (temp < 32);
		
		if (d) {
			System.out.println("Water will freeze with temperature " + temp + " outside");
		}
		else {
			System.out.println("Water will NOT freeze with temperature " + temp + " outside");
		}
		
		//// TASK 3 EXPECTED HOURS
		
		int expected = 10;
		int actual = 5; 
		
		if (expected > actual) {
			System.out.println("You will love the course and you will succeed");
		}
		else {
			System.out.println("Course will be very hard for you");
		}
		
		boolean hungry=true;
		if(hungry) {
			System.out.println("I am going to eat");
			}
		else {
			System.out.println("I am going to drink a tea");
		}
		
		boolean traffic=false;
		if(traffic) {
			System.out.println("I am coming home late");}
		else {
			System.out.println("I am going back home right now");
		}
		
		String h = "Chrome";
		
		if (h == "Chrome") {
			System.out.print("We are executing tests on chrome");
		}
		else{
			System.out.println("I am not executing any test cases");
			{
			
		if (h.equals("Chrome")) {
			System.out.print("We are executing tests on chrome");
		}
		else{
			System.out.println("I am not executing any test cases");
			{
			
				
				
				
			}
		}
			}
		}
	}
}

	


