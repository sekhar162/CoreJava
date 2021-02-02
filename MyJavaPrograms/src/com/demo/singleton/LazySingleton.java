package com.demo.singleton;

public final class LazySingleton {
    private static  LazySingleton instance = null;
 
    // private constructor
    private LazySingleton() {
    }
 
    public static LazySingleton getInstance() {
        if (instance == null)
        {
            synchronized (LazySingleton.class) 
            	{
            		instance = new LazySingleton();
            	}
        }
        return instance;
    }
    
    public  void display() 
    {
    	System.out.println("LAzySingleeton object");
    }
    
}
