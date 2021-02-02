package com.demo.overloadingandoverriding;

public class Test {

	public static void main(String[] args) 
	{
		Operation o=new Operation();
		System.out.println(o.add(2,5));
		System.out.println(o.add(2, 5, 10));
		o.display();
		System.out.println("________________________"+"\n");
		Operation o1=new sum();
		System.out.println(o1.add(6, 9));
		System.out.println(o1.add(6, 9, 14));
		o1.display();
	}

}
