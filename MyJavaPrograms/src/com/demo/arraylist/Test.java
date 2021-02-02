package com.demo.arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test 
{
	public static void main(String[] args) 
	{
		Account a=new Account("ashish", 532145262);
		Account a1=new Account("kumar", 521423651);
		Account a2=new Account("ashish", 532145223);
		Account a3=new Account("kr", 521249651);
		Account a4=new Account("kr", 521249651);
		
		LinkedList<Account> l=new LinkedList<Account>();
		l.add(a);
		l.add(a1);
		l.add(a2);
	
		/*l.add(a3);
		l.add(a3);*/
		
		LinkedList<Account> l1=new LinkedList<Account>();
		l1.add(a);
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		l1.add(a3);
	l.addAll(l1);
/*		System.out.println(l.size());
		System.out.println(l.contains(a2));
		System.out.println(l.getFirst());
		System.out.println(l.clone());
		System.out.println(l.equals(a4));
		System.out.println(l.indexOf(a3));*/
		/*System.out.println(l.set(3, new Account("kr1", 5311)));*/
		System.err.println(l.retainAll(l1));
		System.err.println(l);
		System.out.println(l.toString());
		
		
		ListIterator<Account> itr=l.listIterator(); 
		  while(itr.hasNext())
		  {  
			  System.out.println(itr.next());  
		  }
		  System.out.println("\n"+"iterating in backward direction"+"\n");
		  while(itr.hasPrevious())
		  {  
			  System.out.println(itr.previous());  
		  }
		  
		 
	}
}
