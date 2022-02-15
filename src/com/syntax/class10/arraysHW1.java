package com.syntax.class10;

public class arraysHW1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.

		String[] cars = { "Mazda", "BMW", "Toyota", "Lada", "Mercedes", "Ford" };
		int i = 0;
		for (i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		for (String car : cars) {
			System.out.print(car + " ");
		}

		System.out.println();
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.

		String[] animals = { "Cat", "Dog", "Bird", "Horse", "Cow" };
		int j = 0;
		for (i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		for (String animal : animals) {
			System.out.print(animal + " ");
		}
		System.out.println();

		// Create an array on integers and calculate the sum of all elements in an array
		System.out.println();

		int[] sum = { 55, 43, 23, 51, 68, 53, 31, 56, 21, 56, 12, 53, 53, 12, 53, 12, 67, 88 };

		int k = 0;
		int sums = 0;

		for (k = 0; k < sum.length; k++) {

			sums = sums + sum[k];
		}
		System.out.println("Sum of all numbers in the array is " + sums);

		// From an array of integer elements find the largest number.

		int[] largest = { 55, 43, 23, 51, 68, 53, 31, 56, 21, 56, 12, 58, 53, 12, 53, 12, 67, 88 };
		int l = 0;

		int maxNum = 0;

		for (l = 0; l < largest.length; l++) {

			if (largest[l] > maxNum) {
				maxNum = largest[l];
			}

		}

		System.out.println(maxNum + " is the largest number from the array");

	}

}
