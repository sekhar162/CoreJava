package com.demo.abstractclass;

public class Test 
{
	public static void main(String[] args) 
	{
		Car c=new Audi();
		c.start();
		
		Car c1=new Bmw();
		c1.start();
	}
}
