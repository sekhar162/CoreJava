package com.demo.logical.programs;

import java.util.Scanner;

public class ReadKeyboardInput {

	public static void main(String[] args) {
		System.out.println("please enter 2 int values");
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		int b = scr.nextInt();
		System.out.println("a value is = " + a + " b value is = " + b);

	}

}
