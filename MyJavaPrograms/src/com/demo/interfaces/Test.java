package com.demo.interfaces;

public class Test 
{
	public static void main(String[] args) 
	{
		Audi a=new Audi();
		a.start();
		a.stop();
		Car c= new Bmw();
		c.start();
		c.stop();
	}
}
