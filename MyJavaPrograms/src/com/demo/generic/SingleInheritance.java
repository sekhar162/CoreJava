package com.demo.generic;

public class SingleInheritance {

	protected String str;

	SingleInheritance() {

		str = "Single ";
	}
}

class SubClass extends SingleInheritance {

	SubClass() {

		str = str.concat("Inheritance!!!");
	}

	void display() {

		System.out.println(str);
	}
}

class MainClass {

	public static void main(String args[]) {

		SubClass obj = new SubClass();

		obj.display();
	}
}
