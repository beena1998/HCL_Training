package com.main;

public class Multiple {
	public static void main(String[] args) {
		Number number1 = new Number(2);
		Thread thread = new Thread(number1);
		thread.start();
		Number number2 = new Number(5);

		Thread thread2 = new Thread(number2);
		thread2.start();
		Number number3 = new Number(8);

		Thread thread3 = new Thread(number3);
		thread3.start();

	}

}
