package com.demo.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.demo.arraylist.Account;

public class Test 
{
	public static void main(String[] args) 
	{
		Account a=new Account("vikash", 532145262);
		Account a1=new Account("kumar", 521423651);
		Account a2=new Account("vikas", 532145223);
		Account a3=new Account("kr", 521249651);
		Account a4=new Account("kr", 521249651);
		
		HashMap<Object, Object> hm=new HashMap<>();
		hm.put(1, a);
		hm.put(2,a1);
		hm.put(3,a2);
		hm.put(4,a3);
		hm.put(5,a4);

		
	System.out.println(hm);
	
	System.out.println("for keys: ");
	
	Set<Object> s=hm.keySet();
	Iterator<Object> itr=s.iterator(); 
	  while(itr.hasNext())
	  {  
		  System.out.println(itr.next());  
	  }
		  
	  
		
		  
		 
	}
}
