package com.demo.multithreading.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task3 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
		}
	}
}

class Task4 extends Thread {
	public void run() {
		System.out.println("Hello");
	}
}

public class ExecutorServiceDemo2 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task3());
		executorService.execute(new Thread(new Task4()));
		System.out.println("task3");
		executorService.shutdown();
	}
}
