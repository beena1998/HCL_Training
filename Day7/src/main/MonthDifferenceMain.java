package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import service.MonthDifference;

public class MonthDifferenceMain {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
        MonthDifference difference= new MonthDifference();
           System.out.println(difference.monthsBetweenDates(s1,s2));
	}

}
