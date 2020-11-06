package com.main;

import java.util.Scanner;

import com.service.Addition;

public class AdditionMain {

	public static void main(String[] args) {
		System.out.println("Enter the number of values you want to enter:");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
				
		Addition addition = new Addition();
		addition.addition1(length);

		scan.close();

	}

}
