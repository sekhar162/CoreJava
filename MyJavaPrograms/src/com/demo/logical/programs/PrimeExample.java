package com.demo.logical.programs;

import java.util.Scanner;

public class PrimeExample {
	
	public static void main(String args[]) {
	
		System.out.println("please enter a number to check it is a prime or not");
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		boolean isPrime = true;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {

				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(n + " is  a prime number");

		else
			System.out.println(n + " is not a prime number");

	}

}

/*
 * int i, m = 0, flag = 0; int n = 3;// it is the number to be checked m = n /
 * 2; if (n == 0 || n == 1) { System.out.println(n + " is not prime number"); }
 * else { for (i = 2; i <= m; i++) { if (n % i == 0) { System.out.println(n +
 * " is not prime number"); flag = 1; break; } } if (flag == 0) {
 * System.out.println(n + " is prime number"); } } // end of else }
 */
