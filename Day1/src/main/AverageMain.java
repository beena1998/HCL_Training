package main;

import java.util.Scanner;

import service.Average;

public class AverageMain {
	public static void main(String[] args) {
		Average average = new Average();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		float num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		float num2 = scan.nextInt();
		System.out.println("Enter the third number : ");
		float num3 = scan.nextInt();

		float solution = average.averageFun(num1, num2, num3);
		System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is :" + solution);
		scan.close();
	}
	
}
