package com.demo.logical.programs;

import java.util.Scanner;

public class SwaptwoNumbers {
	public static void main(String[] args) {

		System.out.println("please enter 2 int values");
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		int b = scr.nextInt();
		System.out.println("before swaping a value is = " + a + " b value is = " + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("after swaping a value is = " + a + " b value is = " + b);
	}
}
