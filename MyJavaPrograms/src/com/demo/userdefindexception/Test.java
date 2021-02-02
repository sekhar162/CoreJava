package com.demo.userdefindexception;

public class Test 
{
	public static void main(String[] args) 
	{
		Account a=new Account(50000.0);
		try{
		a.withdrawl(5000000.0);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}