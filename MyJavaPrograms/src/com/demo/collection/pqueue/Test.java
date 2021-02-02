package com.demo.collection.pqueue;

import java.util.PriorityQueue;

public class Test 
{
	public static void main(String[] args) 
	{
		Account a=new Account("vikash", 532145262);
		Account a1=new Account("kumar", 521423651);
		Account a2=new Account("vikas", 532145223);
		Account a3=new Account("kr", 521249651);
		
		PriorityQueue<Account> l=new PriorityQueue<>();
		l.add(a);
		l.add(a1);
		l.add(a2);
		l.add(a3);
		
		System.out.println(l.poll());
		System.out.println(l.poll());
		l.add(new Account("abcd", 521249651));
		System.out.println(l);

		
		 for(Object n:l)
		 {
			 System.out.println(n);
		 }

	}
}
