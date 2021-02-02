package com.demo.nonstaticblock;

public class MyNonStaticBlock {

	{

		System.out.println("first block");
	}

	{
		System.out.println("second block");
	}

	{
		System.out.println("third block");
	}

	public static void main(String[] args) {

		MyNonStaticBlock obj = new MyNonStaticBlock();
	}

}
