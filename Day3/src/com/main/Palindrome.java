package com.main;

import java.util.Scanner;

import com.sevice.CheckPalindrome;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		CheckPalindrome checkPalindrome = new CheckPalindrome();
		System.out.println(checkPalindrome.palindromeYesNo(str));
		
	}

}
