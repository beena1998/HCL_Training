package main;

import java.util.Scanner;

import service.Swap;

public class SwapMain {

	public static void main(String[] args) {
		
		Swap swap= new Swap();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Before swapping");
		System.out.println("First number  : " + num1);
		System.out.println("Second number : " + num2);
		
		swap.swapNumbers(num1, num2);
		scan.close();
		
		
	}

}
