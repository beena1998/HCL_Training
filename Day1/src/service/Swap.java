package service;

public class Swap {

	public void swapNumbers(int num1, int num2) {

		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		System.out.println("After swapping");
		System.out.println("First number  : " + num1);
		System.out.println("Second number : " + num2);
	}
}
