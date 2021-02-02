package com.demo.thiskeyword;

public class Emp
{
	String name;
	String address;
	
	public Emp() 
	{
		System.out.println("deafault construtor");
	}
	
	public Emp(int n)
	{
		this();
	}

	public Emp(String name,String address) 
	{
		this.name = name;
		this.address=address;
		this.address();
	}
	
	

	void address()
	{
		System.out.println(this.name+" address is "+this.address);
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}
	
	public static void main(String[] args) 
	{
		Emp e=new Emp("vikash"," bangalore");
		Emp e1=new Emp("kumar", "BANGaLORE");
		Emp e2=new Emp(10);
		
	}
	
}
