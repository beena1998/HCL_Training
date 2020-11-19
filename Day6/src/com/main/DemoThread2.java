package com.main;

public class DemoThread2 extends Thread{

	@Override
	public void run() {
		super.run();
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
