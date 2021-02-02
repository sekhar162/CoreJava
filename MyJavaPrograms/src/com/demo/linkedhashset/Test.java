package com.demo.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test 
{
	public static void main(String[] args) 
	{
		Account a=new Account("vikash", 532145262);
		Account a1=new Account("kumar", 521423651);
		Account a2=new Account("vikas", 532145223);
		Account a3=new Account("kr", 521249651);
		Account a4=new Account("kr", 521249651);
		
		LinkedHashSet<Account> hs=new LinkedHashSet<Account>();
		hs.add(a);
		hs.add(a1);
		hs.add(a2);
		hs.add(a3);
		hs.add(a4);
		
		Iterator<Account> itr=hs.iterator(); 
		  while(itr.hasNext())
		  {  
			  System.out.println(itr.next());  
		  }
		  
		  
		
		  
		 
	}
}
