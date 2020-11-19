package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		LocalDateTime current = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted = current.format(formatter);

		System.out.println("Current Date is: " + formatted);
		System.out.println("thread under process");
	}

}
