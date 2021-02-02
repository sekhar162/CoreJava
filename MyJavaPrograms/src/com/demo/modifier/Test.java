package com.demo.modifier;

public class Test 
{
	public static void main(String[] args) 
	{
		Default d=new Default();
		d.display();
		
		Private p=new Private();
//		p.display();
		
		Protected p1=new Protected();
		p1.display();
		
		Public p2=new Public();
		p2.display();
		
	}
}
