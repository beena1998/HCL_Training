package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FindOldDate {
public static String findOldDate(String date1, String date2) throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
	Date d1=dateFormat.parse(date1);
    Date d2=dateFormat.parse(date2);
	
	if (date1.compareTo(date2) > 0) { 
		  
       
        System.out.println("Date1 is after Date2"); 
  return d2.toString();
    } 

    else if (date1.compareTo(date2) < 0) { 

        
        System.out.println("Date1 is before Date2"); 
        return d1.toString();
    } 

    else if (date1.compareTo(date2) == 0) { 

        
        System.out.println("Date1 is equal to Date2"); 
      return date1.toString();
    } 
	return date1.toString();
}
}
