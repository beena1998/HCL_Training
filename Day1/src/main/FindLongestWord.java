package main;

import java.util.Scanner;
import service.LongestWord;

public class FindLongestWord {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		LongestWord longestword = new LongestWord();

		String string = longestword.getLargestWord(str);
		System.out.println(string);

		scan.close();
		longestword = null;
	}

}
