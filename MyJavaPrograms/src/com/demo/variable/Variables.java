package com.demo.variable;

public class Variables 
{
	int i=10;
	static int j=20;
	
	public static void main(String[] args) 
	{
		int a=30;
		
//		System.out.println(i);
		System.out.println("j= "+j);
		System.out.println("a= "+a);
		
		Variables v=new Variables();
		Variables v1= new Variables();
		v.i=21;
		v1.i=22;
		v.j=23;
		v1.j=24;
		System.out.println(v.i);
		System.out.println(v1.i);
		System.out.println(v.j);
		System.out.println(v1.j);
	}

}
