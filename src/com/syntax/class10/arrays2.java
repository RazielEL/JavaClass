package com.syntax.class10;

public class arrays2 {

	public static void main(String[] args) {
		int[][] numbers = new int[3][4];

		// 1 row or array

		numbers[0][0] = 10; // [row][column]
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		numbers[1][0] = 100;
		numbers[1][1] = 200;
		numbers[1][2] = 300;
		numbers[1][3] = 400;

		numbers[2][0] = 1000;
		numbers[2][1] = 2000;
		numbers[2][2] = 3000;
		numbers[2][3] = 4000;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}

}
