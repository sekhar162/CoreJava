package com.demo.userdefindexception;

public class Account 
{
	static double balance;
	
	
	public Account(double balance)
	{
		
		Account.balance = balance;
	}


	public void withdrawl(double amount) throws InsufficientFundException
	{
		if(amount>balance)
		{
			throw new InsufficientFundException("Insufficient Fund ");
		}
		else 
		balance-=amount;
		
	}
}
 class InsufficientFundException extends RuntimeException
{
	 private static final long serialVersionUID = 1L;

	public InsufficientFundException(String s)

	{
	super(s);
	}
}
