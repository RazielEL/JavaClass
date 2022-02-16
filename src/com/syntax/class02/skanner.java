package com.syntax.class02;


public class skanner {

    public static void main(String[] args) {
        
    	int n = 4;
    	
    	boolean a = (n%2!=0) && (n!=1);
    	if (a) {
    		System.out.println("Weird");
    	}
    	
    	boolean b = (n>=2 && n<=5 && n%2==0 && n!=1);
    	
    	if (b) {
    		System.out.println("Not Weird");
    	}
    }
}

