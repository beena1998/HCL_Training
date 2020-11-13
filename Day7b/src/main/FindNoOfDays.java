package main;

import java.util.Scanner;

import service.FindDays;

/*
 * 
 * Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...),
 * write a program to find out total number of days in the given month for the given year. 
 * 
 * @BEENA KANDPAL
 * 
 */

public class FindNoOfDays {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter year:");
	int year=scan.nextInt();
	System.out.print("Enter month (January=0, Feb=2 ...): ");
	int month=scan.nextInt();
	FindDays findDays =new FindDays();
	
	int days=findDays.findNoOfDaysInMonth(year, month);
	
	if(days==0) {
		System.err.println("Enter Valid Input!! ");
	}
	else {
		System.out.println("Number of days: "+ days);
	}
	
	scan.close();
	findDays=null;
	

	}

}
