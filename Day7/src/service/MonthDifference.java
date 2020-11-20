package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MonthDifference {
	public static int monthsBetweenDates(String s1, String s2) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                        Date d1=sdf.parse(s1);
                        Date d2=sdf.parse(s2);
        Calendar cal=Calendar.getInstance();
       
        cal.setTime(d1);
                        int months1=cal.get(Calendar.MONTH);
                        int year1=cal.get(Calendar.YEAR);
        cal.setTime(d2);
                        int months2=cal.get(Calendar.MONTH);
                        int year2=cal.get(Calendar.YEAR);
        int n=((year2-year1)*12)+(months2-months1);
        return n;

}}
