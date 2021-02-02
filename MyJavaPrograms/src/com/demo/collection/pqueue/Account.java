package com.demo.collection.pqueue;

public class Account 
{
	String name;
	int accNum;
	
	public Account(String name, int accNum) 
	{
		super();
		this.name = name;
		this.accNum = accNum;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accNum=" + accNum + "]";
	}
	
}
