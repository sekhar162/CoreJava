package com.demo.exception;

public class Exception1 
{
	public static void main(String[] args) 
	{
		try{
		int a=10;
		int b=a/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("task 2 completed"); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("task 1 is completed");
		}  
		
		 catch(Exception e1)
		{
			 System.out.println("common task completed");
		}
	}
	
}
