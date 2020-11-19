package com.main;

public class Number implements Runnable {
	private int num;

	public Number(int num) {
		this.num = num;
	}

	public void multi(int num) {
		if (num == 2) {
			System.out.println("Start :: Multiples of 2 : ");
			for (int i = 1; i < 11; i++) {
				System.out.println(2 * i);
			}
			System.out.println("End :: Multiples of 2 : ");
		} else if (num == 5) {
			System.out.println("Start :: Multiples of 5 : ");
			for (int i = 1; i < 11; i++) {
				System.out.println(5 * i);
			}
			System.out.println("End :: Multiples of 5 : ");
		}
		if (num == 8) {
			System.out.println("Start :: Multiples of 8 : ");
			for (int i = 1; i < 11; i++) {
				System.out.println(8 * i);
			}
			System.out.println("End :: Multiples of 8: ");
		}

	}

	@Override
	public void run() {

		System.out.println("Start: of run");
multi(num);
		System.out.println("End: of run");
	}

}
