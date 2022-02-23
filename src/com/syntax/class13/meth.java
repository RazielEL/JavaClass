package com.syntax.class13;
import java.util.*;

public class meth {
	
		void crystal(String name){
		if (name.equals("Teyfur")) {
			System.out.println("Send memes");
		}
		else if (name.equals("Maha")) {
			System.out.println("I am a doctor");
		}
		else{
			System.out.println("I dont know you");
		}
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tell me your name: ");
		String name = sc.nextLine();
		
		meth teyfur = new  meth();
		teyfur.crystal(name);
		
		
	}

}
