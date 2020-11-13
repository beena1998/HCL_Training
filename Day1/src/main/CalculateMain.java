package main;

import service.Calculate;
import java.util.Scanner;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
 * 
 * @ Beena Kandpal
 * 
 * */ 
public class CalculateMain {

	public static void main(String[] args) {
		Calculate calculate = new Calculate();

		Scanner scanner = new Scanner(System.in);
		
		String yes;
		String yes1;
		do {

		System.out.println("Input first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Input second number : ");
		int num2 = scanner.nextInt();

		System.out.println("Enter your choice: \n");
		System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division\n5.Remainder\n");

		int choice = scanner.nextInt();
		int ans;

		switch (choice) {
		case (1):
			ans = calculate.addition(num1, num2);
			System.out.println(ans);
			break;
		case (2):
			ans = calculate.subtraction(num1, num2);
			System.out.println(ans);
			break;
		case (3):
			ans = calculate.multiplication(num1, num2);
			System.out.println(ans);
			break;
		case (4):
			ans = calculate.division(num1, num2);
			System.out.println(ans);
			break;
		case (5):
			ans = calculate.remainder(num1, num2);
			System.out.println(ans);
			break;
		default:
			System.out.println("Invalid input");
			break;

		}
		System.out.println("Do you want to continue. If yes then : y");
		yes1="y";
		yes=scanner.next();
		}while(yes1.equalsIgnoreCase( yes));
		scanner.close();
	}

}
