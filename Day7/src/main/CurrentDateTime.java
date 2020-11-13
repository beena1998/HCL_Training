package main;

/*
 * Write a java program to print current date and time in the specified format. 
 * 
 * @BEENA KANDPAL
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted = current.format(formatter);

		System.out.println("Current Date is: " + formatted);
	}
}


//Current Date is: 12/11/20, 1:31 pm : SHORT
//Current Date is: 12-Nov-2020, 1:33:02 pm : MEDIUM