package com.syntax.class03;

public class casting {

	public static void main(String[] args) {
		// Casting - process of converting the value from one type to another.
		// 2 types of casting:
		// widening / implicit / automatic
		
		double d = 10;
		
		// byte -> short -> int -> long -> float -> double
		
		// Narrowing / Explicit / Manual
		
		int i = 10;
		
		int num = (int)10.99;
		// zeby przekonwertowac mniejszy na wiekszy musimy tak robic, do narrowing. Zeby odwrotnie to sie samo robi.
		System.out.println(num);

		float f=10.99f;
		
		int g = (int)10.99f;
		
		System.out.println(g);
		
		long l = 130;
		byte h = (byte) 155;
		
		System.out.println(h);
	}

}
