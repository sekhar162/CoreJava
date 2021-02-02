package com.demo.logical.programs;

public class PolindromeNumbers
{

	public static void main(String[] args) 
	{
		int n, b, rev = 0;
		int limit=100;
		System.out.print("Palindrome numbers from 1 to N:");
		for (int i = 1; i <= limit; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
		
	}

}
//1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99
