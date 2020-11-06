package main;

import java.util.Scanner;

import service.Multiples;

public class MultiplesMain {

	public static void main(String[] args) {

		Multiples multiples = new Multiples();
		Scanner scan = new Scanner(System.in);

		int i;
		for (i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i+": Fizz Buzz");
				

			}

			if (i % 3 == 0) {
				System.out.println(i+": Fizz");
				
			}
			if (i % 5 == 0) {
				System.out.println(i+": Buzz");
			}

		}

	}

}
