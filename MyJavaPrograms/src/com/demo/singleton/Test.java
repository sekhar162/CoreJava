package com.demo.singleton;

public class Test {

	public static void main(String[] args) {
		
		EagerSingleton eagerSingleton= EagerSingleton.getInstance();
		eagerSingleton.display();
		
		EagerSingleton eagerSingleton1= EagerSingleton.getInstance();
		
		LazySingleton lazySingleton=LazySingleton.getInstance();
		lazySingleton.display();
		
		LazySingleton lazySingleton1=LazySingleton.getInstance();
		
		
	}

}
