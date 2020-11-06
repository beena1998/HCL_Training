package main;

import java.util.Scanner;

import service.Prime;

public class PrimeMain {
	public static void main(String []args) {
		
		Prime prime = new Prime();
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number= scan.nextInt();
		prime.CheckPrime(number);	
		scan.close();
		
	}

}
