package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MyThread1Main {
public static void main(String[] args) {
	MyThread1 t1= new MyThread1();
	t1.start();
	t1.setName("MyThread");
	System.out.println("Thread name changed : "+ t1.getName());
	LocalDateTime current = LocalDateTime.now();

	DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	String formatted = current.format(formatter);

	System.out.println("Current Date is: " + formatted);
}
}
