package com.main;

import java.util.Scanner;

import com.service.Vowels;

public class VowelsMain {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Vowels vowels= new Vowels();
	
		int vowelsNum=vowels.countVowels(str);
		System.out.println(str);
		System.out.println("Number of VOWELS in the string : "+ vowelsNum);
		scan.close();
		vowels=null;
	}

}
