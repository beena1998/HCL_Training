package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import service.ChangeDateFormat;

public class ChangeDateFormatMain {

	public static void main(String[] args) throws ParseException {
		System.out.println("Enter date (dd/MM/yyyy): ");
		Scanner scan= new Scanner(System.in);
	      String enterDate = scan.next();
	      
	      Date date = ChangeDateFormat.StringToDate(enterDate);
	      System.out.println("Date in the format: MM-dd-yyyy");
          System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(date));

	}

}
