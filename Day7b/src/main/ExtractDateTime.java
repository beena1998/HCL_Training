package main;
/*
 * Write a Java program to extract date, time from the date string 
 * 
 * @BEENA KANDPAL
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateTime {

	public static void main(String[] args) {
		try {    
		      String originalString = "2020-11-12 09:00:02";
		      Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
		      String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
		       System.out.println("\n"+newstr+"\n");
		      } 
		    catch (ParseException e) {
		    //Handle exception here
		     e.printStackTrace();
		     }

	}

}
