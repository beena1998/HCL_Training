package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeDateFormat {
	public static Date StringToDate(String enterDate) throws ParseException {
	      //Instantiating the SimpleDateFormat class
	      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	      //Parsing the given String to Date object
	      Date date = formatter.parse(enterDate);
	      System.out.println("Date object value: "+date);
	      return date;
	   }

}
