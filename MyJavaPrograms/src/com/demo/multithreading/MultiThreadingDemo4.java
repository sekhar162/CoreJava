package com.demo.multithreading;

public class MultiThreadingDemo4 {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		// t1.isAlive() is used to check the thread is alive or not . if thread is
		// executing then it returns true .once the thread execution is done then it
		// returns false.
		System.out.println(t1.isAlive());
		// if want to print bye after execution of t1 and t2 threads then u have to use
		// join method .
		try {
			t1.join();
			t2.join();
			System.out.println(t1.isAlive());
		} catch (InterruptedException e) {

		}
		System.out.println("Bye");
	}

}
