package com.syntax.class11;
import java.util.Arrays;
import java.util.Scanner;
public class exe1 {

	public static void main(String[] args) {
		// crate array of int with scanner and sum all numbers inside.

		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Input array length");
		
		int a = sc.nextInt();
		int i = 0;
		int arr[] = new int[a];
		int sum = 0;
		
		
		for (i = 0; i < a; i++) {
			System.out.print("Input " + (i+1) + " number of th array:");
			arr[i] = sc.nextInt();
			
			sum = sum + arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Sum of array = " + sum);
		
		// PRINTING OUT THE ELEMENTS OF AN ARRAY WITHOUT A LOOPS:
		
		
		
		
	}

}
