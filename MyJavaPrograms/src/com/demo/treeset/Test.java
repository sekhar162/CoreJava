package com.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) 
	{
		Account a=new Account("ashish", 53);
		Account a1=new Account("kumar", 52);
		Account a2=new Account("ashish", 5421);
		Account a3=new Account("kr", 651);
		Account a4=new Account("kr", 9651);
		
		TreeSet<Account> ts=new TreeSet<Account>();
		ts.add(a);
		ts.add(a1);
		ts.add(a2);
		ts.add(a3);
		ts.add(a4);
	
		Iterator<Account> itr=ts.iterator(); 
		  while(itr.hasNext())
		  {  
			  System.out.println(itr.next());  
		  }
		  
		  
		
		  
		 
	}
}
