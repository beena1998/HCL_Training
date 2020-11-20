package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import service.FindOldDate;

public class FindDateMain {

	public static void main(String[] args) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter dates: ");
//		String date1 = scan.next();
//		String date2 = scan.next();
		try {   SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		
	      Date d1 = sdformat.parse("2019-04-15");
	      Date d2 = sdformat.parse("2019-08-10");
	      System.out.println("The date 1 is: " + sdformat.format(d1));
	      System.out.println("The date 2 is: " + sdformat.format(d2));
	      
//			Date d1 = dateFormat.parse(date1);
//			Date d2 = dateFormat.parse(date2);
//
//			System.out.println("Date1 : " + dateFormat.format(d1));
//			System.out.println("Date2 : " + dateFormat.format(d2));
			FindOldDate date = new FindOldDate();
			String result=date.findOldDate(d1.toString(), d2.toString());
			System.out.println("Old Date : "+ result);

		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}
