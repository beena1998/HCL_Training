package main;

import java.util.Scanner;

import service.UserMainCodeForEvenDigits;

public class MainForEvenDigits {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		UserMainCodeForEvenDigits maincode = new UserMainCodeForEvenDigits();
		double res = maincode.sumOfSquaresOfEvenDigits(number);
		System.out.println(res);
		scan.close();
		maincode=null;
	}

}
