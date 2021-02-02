package com.demo.generics;


public class GenericsMethods {

	//Java Generic Method
	public static <T> boolean isEqual(GenericsClass<T> g1, GenericsClass<T> g2){
		return g1.get().equals(g2.get());
	}
	
	public static void main(String args[]){
		GenericsClass<String> g1 = new GenericsClass<>();
		g1.set("Pankaj");
		
		GenericsClass<String> g2 = new GenericsClass<>();
		g2.set("Pankaj");
		
		System.out.println(GenericsMethods.<String>isEqual(g1, g2)); 
		//above statement can be written simply as
		System.out.println(GenericsMethods.isEqual(g1, g2)); 
		//This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
		//Compiler will infer the type that is needed
	}
}
