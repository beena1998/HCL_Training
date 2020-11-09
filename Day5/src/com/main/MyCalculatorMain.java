package com.main;

import java.util.Scanner;

import com.service.MyCalculator;

import appexception.UserDefinedException;

public class MyCalculatorMain {

	public static void main(String[] args) {
		Scanner scan=null;
		MyCalculator calculator=null; 
		
		try {
		System.out.println("Enter power then number whose power you want to find : ");
		scan=new Scanner(System.in);
		int input1=scan.nextInt();
		int input2=scan.nextInt();
		calculator= new MyCalculator();
		System.out.println(calculator.power(input1, input2));
	}catch(UserDefinedException usd) {
		System.err.println(usd.getMessage());
		}finally {
			scan.close();
			calculator=null;
			
		}
	}

}
