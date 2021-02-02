package com.demo.abstractclass;

abstract class Car 
{
	abstract void start();
}

class Audi extends Car
{

	@Override
	void start()
	{
		System.out.println("Audi started");
	}
}
class Bmw extends Car
{

	@Override
	void start() 
	{
		System.out.println("BMW started");
	}
}


