package com.demo.generic;

public interface MultipleInheritance {
	
	String str1 = "This ";
}
 
interface Interface2 {
	
	String str2 = "is ";
}
 
interface Interface3 {
	
	String str3 = "Java ";
}
 
interface Interface4 {
	
	String str4 = "World !!!"; 
}

class SubClass1 implements MultipleInheritance, Interface2, Interface3, Interface4 {
	
	String str;
	
	SubClass1() {
		
		str = str1.concat(str2).concat(str3).concat(str4);
	}
	
	void display() {
		
		System.out.println(str);
	}
}

class Test {
	
	public static void main(String args[]) {
		
		SubClass obj = new SubClass();
		
		obj.display();
	}
}
 
