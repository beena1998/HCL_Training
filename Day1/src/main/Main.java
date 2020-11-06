package main;

import java.util.Scanner;

import service.UserMainCode;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		UserMainCode maincode = new UserMainCode();

		int res = UserMainCode.checkSum(number);

		if (res == 1) {
			System.out.println("Sum of odd digits is ODD");
		} else
			System.out.println("Sum of odd digits is EVEN");
		scan.close();
		maincode = null;

	}

}
