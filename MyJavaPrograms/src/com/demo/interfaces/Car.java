package com.demo.interfaces;

interface Car 
{
	void start();
	void stop();
}

class Audi implements Car
{

	@Override
	public void start() 
	{
		System.out.println("Audi is started");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("Audi is stopped");
	}
	
}
class Bmw implements Car
{

	@Override
	public void start() 
	{
		System.out.println("BMW is started");
	}

	@Override
	public void stop() 
	{
		System.out.println("BMW is stopped");
	}
}
