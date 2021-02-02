package com.demo.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

import com.demo.arraylist.Account;

public class Test 
{
	public static void main(String[] args) 
	{
		Account a=new Account("vikash", 532145262);
		Account a1=new Account("kumar", 521423651);
		Account a2=new Account("vikas", 532145223);
		Account a3=new Account("kr", 521249651);
		
		ArrayList<Account> l=new ArrayList<Account>();
		l.add(a);
		l.add(a1);
		l.add(a2);
		l.add(a3);
		
		
		System.out.println(l.size());
		System.out.println(l.contains(a2));
		System.out.println(l.get(3));
		System.out.println(l.clone());
		System.out.println(l.isEmpty());
		System.out.println(l.clone());
		System.out.println(l.size());
		System.out.println(l.indexOf(a3));
		System.out.println(l.set(3, new Account("kr1", 5311)));
		System.out.println(l.toString());
		
	
		
		Iterator<Account> itr=l.iterator();  
		  while(itr.hasNext())
		  {  
			  System.out.println(itr.next());  
		  }
	}
}
