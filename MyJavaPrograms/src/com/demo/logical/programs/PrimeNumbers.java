package com.demo.logical.programs;

import java.util.Scanner;

//Prime numbers from 1 to 100 are :
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Please enter a number to print the prime numbers up to that number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				} else
					isPrime = true;
			}
			if (isPrime) {
				System.out.print(i + " ");
			}

		}

	}
}
