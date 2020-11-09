package com.main;

import java.util.Scanner;

import com.sevice.StringTrim;

public class StringTrimMain {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Enter the indices from where to where you want to trim :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		StringTrim stringTrim = new StringTrim();

		System.out.println("After trimimg: "+ stringTrim.trimIt(str, num1, num2));
		scan.close();
		stringTrim=null;

	}

}
