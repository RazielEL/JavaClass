package com.syntax.class11;

import java.util.Arrays;

public class ArrayWithoutLoop {

	public static void main(String[] args) {
		
		int[][] arr = {{55, 43, 23, 51, 68, 53, 31, 56, 21}, {56, 12, 53, 53, 12, 53, 12, 67, 88}};
		
		
		for (int x = 0; x < arr.length; x++) {
			System.out.println(Arrays.toString(arr[x]));
		}
	

	}

}
