package com.syntax.class02;

public class Task002 {

	public static void main(String[] args) {

		// Exercise 1

		double a = 2.5d;
		double b = 5.2d;

		double sum, sub, mul, div;

		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;

		System.out.println("The sum of 2 numbers: " + a + " " + b + " is equal to " + sum + ".");
		System.out.println("The sub of 2 numbers: " + a + " " + b + " is equal to " + sub + ".");
		System.out.println("The product of 2 numbers: " + a + " " + b + " is equal to " + mul + ".");
		System.out.println("The quotient of 2 numbers: " + a + " " + b + " is equal to " + div + ".");
		System.out.println();

		// Exercise 2

		double c = 3.9d;
		double sq = c * c;

		System.out.println("The square of " + c + " equals " + sq + ".");
		System.out.println();
		// Exercise 3

		double w, h, peri, area;
		w = 5d;
		h = 8d;
		peri = 2 * (w + h);
		area = w * h;

		System.out.println("The perimeter of a rectangle with width = " + w + " and height = " + h + " is equal to "
				+ peri + " and the area is equal to " + area);

	}

}
