package com.syntax.class02;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        
        System.out.println("Input a: ");
        int a= sc.nextInt();

        System.out.println("Input b: ");
        int b= sc.nextInt();

        System.out.println("Input c: ");
        int c= sc.nextInt();

        System.out.println("Your equation is: " + a+"x²+"+b+"x+"+c+"= 0");

        int delta = (b * b)- (4*a*c);

        if (delta < 0){
            System.out.println("Delta is negative");
        }
        
        else {
        	
            System.out.println("Delta = " + delta);

            double sqrt = Math.sqrt(delta);
            
            System.out.println("Delta sqrt = " + sqrt);

            double X1 = (-b - sqrt) / (2 * a);
            double X2 = (-b + sqrt) / (2 * a);
            
            if (X1 == X2) {
            	System.out.println("X = " + X1);
            }
            
            else {
            	System.out.println("X1 = " + X1);
            	System.out.println("X2 = " + X2);
            }
        }
    }
}
            
            
       
    
