package com.demo.multithreading.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Hi");
		}
	}
}

class Task2 extends Thread {
	public void run() {
		System.out.println("Hello");
	}
}

public class ExecutorServiceDemo1 {
	public static void main(String[] args) {
		// Single thread executor
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		System.out.println("task3");
		executorService.shutdown();
	}
}
