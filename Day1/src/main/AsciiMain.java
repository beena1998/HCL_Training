package main;

import java.util.Scanner;

import service.Ascii;

public class AsciiMain {

	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character: ");
		String character = scan.next();
		char ch = character.charAt(0);
		int res = ascii.displayAscii(ch);
		System.out.println("ASCII value of " + character + "is :" + res);
		scan.close();
		ascii=null;
	}

}
