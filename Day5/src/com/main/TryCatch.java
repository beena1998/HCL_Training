package com.main;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
Scanner scan=null;
		try {
			System.out.println("Enter two integers:");
			scan = new Scanner(System.in);
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			System.out.println(input1/input2);
		} catch (java.util.InputMismatchException e) {
			System.out.println(e);

		} catch (java.lang.ArithmeticException e2) {

			System.out.println(e2);
		}catch (Exception e3) {

			System.out.println(e3);
		}finally {
			scan.close();
			
		}
	}

}
