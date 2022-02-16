package com.syntax.class03;

import java.security.PublicKey;

public class shortHandOperators {

	
	public static void main(String[] args) {
		
		
		int num = 100;
		num = num + 100;
		System.out.println(num);
		
		num +=100; // this means num = num + 100;
		System.out.println(num);
		
		num -=20;	// this means num = num - 20;
		System.out.println(num);
		
		num /=4;   // this means num = num / 4;
		System.out.println(num);
		
		num %=4;	// this means num = num % 4;
		System.out.println(num);

	}

}
