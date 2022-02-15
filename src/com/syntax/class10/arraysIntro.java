package com.syntax.class10;

import java.util.Scanner;

public class arraysIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// declare an array
		int[] myNum = new int[4];

		// store values in an array
		myNum[0] = 5;
		myNum[1] = 10;
		myNum[2] = 25;
		myNum[3] = 100;

		System.out.println(myNum[2] + myNum[1]);

		// creating array of strings
		String[] countries = new String[5];

		// store values
		countries[0] = "Poland";
		countries[1] = "USA";
		countries[2] = "Russia";
		countries[3] = "Ukraine";
		countries[4] = "Canada";

		System.out.println(countries[4]);

		// creating array SECOND WAY

		String[] color = { "red", "blue", "grey", "yellow", "green", "orange" };

		System.out.println(color[2]);

		/////// TASK1 //////// :

		char[] letter = new char[6];
		letter[0] = 'A';
		letter[1] = 'B';
		letter[2] = 'C';
		letter[3] = 'D';
		letter[4] = 'E';
		letter[5] = 'F';
		System.out.println(letter[1]);
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(letters[1]);

		/////// TASK 2 ///////// :

		String[] names = new String[9];
		names[0] = "Roman";
		names[1] = "Maria";
		names[2] = "Jose";
		names[3] = "John";
		names[4] = "Elmar";
		names[5] = "Andrew";
		names[6] = "Amanda";
		names[7] = "Adam";
		names[8] = "Ahmed";
		System.out.println(names[7]);

		String[] name = { "Roman", "Maria", "Jose", "Elmar", "Andrew", "Amanda", "Adam", "Ahmed" };
		System.out.println(name[6]);

		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

	}

}
