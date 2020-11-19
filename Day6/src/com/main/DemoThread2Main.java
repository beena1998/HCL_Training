package com.main;

public class DemoThread2Main {

	public static void main(String[] args) {
		DemoThread2 demoThread1= new DemoThread2();
		DemoThread2 demoThread2= new DemoThread2();
		DemoThread2 demoThread3= new DemoThread2();
		demoThread1.run();
		demoThread2.run();
		demoThread3.run();

	}

}
