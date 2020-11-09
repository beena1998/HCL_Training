package com.main;

import java.util.Scanner;

import com.sevice.Replace;

public class ReplaceMain {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Replace replace =new Replace();
		System.out.println("Replaced String : "+replace.replaceString(str));
	}

}
