package com.demo.encapsulation;

public class Test {

	   public static void main(String args[]) {
		   Encapsulation encap = new Encapsulation();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	   }
	}
