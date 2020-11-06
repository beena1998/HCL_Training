package service;

import java.util.Scanner;

public class Calculate {
	
	/*
	 * public Calculate(int num1, int num2) { super(); this.num1 = num1; this.num2 =
	 * num2; }
	 */

	public int addition(int... num1) {
		int sum = 0;
		for (int i = 0; i < num1.length; i++) {
			sum += num1[i];
		}
		return sum;
	}

	public int subtraction(int num1, int num2) {

		if (num1 > num2) {
			return num1 - num2;
		} else
			return num2 - num1;

	}

	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public int division(int num1, int num2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("You want to divide " + num1 + " by " + num2 + ". If yes type: Y");
		String yes = scan.next();
		String yes1="y";
		if (yes1.equalsIgnoreCase(yes))
			return num1 / num2;
		else
			return num2 / num1;
	}

	public int remainder(int num1, int num2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("You want to find remainder of "+num1+"from"+num2+". If yes type: Y");
		String yes = scan.next();
		String yes1="y";
		if (yes1.equalsIgnoreCase(yes))
			return num1%num2;
		else
			return num2%num1;
		
	}

}
