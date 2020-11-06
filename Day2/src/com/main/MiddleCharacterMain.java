package com.main;

import java.util.Scanner;

import com.service.MiddleCharacter;

public class MiddleCharacterMain {

	public static void main(String[] args) {

		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		MiddleCharacter middlecharacter= new MiddleCharacter();
	
		String middle=middlecharacter.findMiddle(str);
		System.out.println("The middle character in the string : "+ middle);
		scan.close();
		middlecharacter=null;
		
	}

}
