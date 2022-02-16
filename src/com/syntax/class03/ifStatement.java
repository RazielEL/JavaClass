package com.syntax.class03;

public class ifStatement {

	public static void main(String[] args) {
		
		// compare 2 nukbers and which is bigger
		
		int num1 = 100;
		int num2 = 50;
		
		if (num1>num2) {
			System.out.println(num1 + " jest wiekszy niz " + num2);
		}
		else {
			System.out.println(num2 + " jest wiekszy niz " + num1);
		}

		int a = 100;
		int b = 50;
		
		String c = (a > b) ? (a + " jest wieksze") : (b + "jest mniejsze");
		
		System.out.println(c);
		
		double money = 5;
		double coffee = 4.99d;
		
		boolean buy = money > coffee;
		
		if (buy)
			System.out.println("Kupowac");
		else
			System.out.println("Nie kupowac");
		
		int temp = 25;
		boolean go = (temp > 20);
		if (go) {
			System.out.println("Ide na spacer");
		}
		else {
				System.out.println("Zostaje w domu");
			}
		
		
		
		
		}
	}


