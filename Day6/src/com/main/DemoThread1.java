package com.main;

public class DemoThread1 implements Runnable {

	public DemoThread1() {
		super();
		System.out.println("Inside:");
		Thread thread =new Thread();
		thread.start();
	}

	@Override
	public void run() {
		
		System.out.println("Running in child Thread in loop:");
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

}
