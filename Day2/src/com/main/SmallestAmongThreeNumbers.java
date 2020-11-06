package com.main;

import java.util.Scanner;

import com.service.SmallestNumber;

public class SmallestAmongThreeNumbers {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		System.out.println("Enter the third number");
		int num3=scan.nextInt();
		
		SmallestNumber smallestnumber=new SmallestNumber();

		int result=smallestnumber.findSmallest(num1,num2,num3);
		
		System.out.println("Smallest number among "+num1+" "+num2+" "+num3+" is :"+result);
	}

}
