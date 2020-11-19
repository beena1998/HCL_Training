package com.main;

public class DemoThread1Main {

	public static void main(String[] args) {
		DemoThread1 demoThread1= new DemoThread1();
		DemoThread1 demoThread2= new DemoThread1();
		DemoThread1 demoThread3= new DemoThread1();
		demoThread1.run();
		demoThread2.run();
		demoThread3.run();
//		Thread thread1= new Thread(demoThread1);
//		Thread thread2= new Thread(demoThread1);
//		Thread thread3= new Thread(demoThread1);

//		thread1.start();
//		thread2.start();
//		thread3.start();
	}

}
