package com.main;

import java.util.Scanner;

import com.sevice.ToLowerCase;

public class ToLowerCaseMain {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("String converted to lower case:");
		ToLowerCase case1 = new ToLowerCase();
		System.out.println(case1.convertToLower(str));
		scan.close();
		case1 = null;

	}

}
