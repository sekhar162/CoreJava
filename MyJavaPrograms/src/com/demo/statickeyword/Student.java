package com.demo.statickeyword;

public class Student
{
	static String name;
	static int id;
	static String address;
	
	static
	{
		name="VIKASH";
		id=114;
		address="BANGALORE";
	}
	static void display()
	{
		System.out.println(name+" having id no "+id+" lives in "+address);
	}
	
	public static void main(String[] args) 
	{
		Student.display();
	}
}
