package com.demo.multithreading.executor.service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String> {

	public String call() throws InterruptedException {
		Thread.sleep(100);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
		}
		return "hello";
	}
}

public class CallableInterface {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	    // we can use newFixedThreadPool or newSingleThreadExecutor
		//	ExecutorService executorService = Executors.newFixedThreadPool(1);
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> result = executorService.submit(new Task());
		String msg=result.get();
		System.out.println(msg);
		executorService.shutdown();
	}
}
