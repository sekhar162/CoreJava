package com.demo.overloadingandoverriding;

public class Operation

{
	int add(int a,int b)
	{
		return a+b;
	}
	
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	void display()
	{
		System.out.println("display method of operation class");
	}
}

class sum extends Operation
{
	void display()
	{
		System.out.println("display method of sum class");
	}
}
