package com.syntax.class11;

import java.util.Arrays;

public class storeEvenOddin2DAray {

	public static void main(String[] args) {
		
		int[][] arr = {{55, 43, 23, 51, 68, 53, 31, 56, 21}, {56, 12, 53, 53, 12, 53, 12, 67, 88}, {1,2,3,5,4,8,9,6,74}};
		int[][] even = new int [3][10];
		int[][] odd = new int [3][10];
		int[] niceEven = new int [60];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
	}
			System.out.println();
}
		System.out.println();
		System.out.println();
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] %2 == 0) {
					even[i][j] = arr[i][j];
				}
				if (even[i][j] == 0) {
					continue;
				}
				System.out.print(even[i][j] + " ");
				
	}
			System.out.println();
}
		System.out.println();
		System.out.println();
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] %2 != 0) {
					odd[i][j] = arr[i][j];
				}
				if (odd[i][j] == 0) {
					continue;
				}
				System.out.print(odd[i][j] + " ");
				
	}
			System.out.println();
}
		System.out.println();
		System.out.println();
		
		
		niceEven[0] = even[0][0];

		
			System.out.println(Arrays.toString(niceEven));
		
		
		
		
	}
}
