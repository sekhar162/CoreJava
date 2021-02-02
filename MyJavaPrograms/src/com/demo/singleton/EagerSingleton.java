package com.demo.singleton;

public class EagerSingleton {
    private static  EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }
    public void display() 
    {
    	System.out.println("EagerSingleton object");
    }

}
