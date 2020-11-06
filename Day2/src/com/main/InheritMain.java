package com.main;

import java.util.Scanner;

import com.service.A;
import com.service.B;

public class InheritMain {

	public static void main(String[] args) {
		System.out.println("Enter the value of a:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
		
		B bclass= new B();
		bclass.addition(a, b);
	      bclass.Subtraction(a, b);
	      bclass.multiplication(a, b);
		scan.close();
		bclass=null;
		
	}

}

