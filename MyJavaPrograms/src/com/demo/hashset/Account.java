package com.demo.hashset;

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
	public boolean equals(Object obj) {
		if(!(obj instanceof Account)) return false;
		Account a=(Account) obj;
			return name.equals(a.name)&&accNum==a.accNum;
	}
	@Override
	public int hashCode() {
		return accNum;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accNum=" + accNum + "]";
	}
	
}
