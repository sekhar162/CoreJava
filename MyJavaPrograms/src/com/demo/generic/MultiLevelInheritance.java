package com.demo.generic;

public class MultiLevelInheritance {

	protected String str;

	MultiLevelInheritance() {

		str = "J";
	}
}

class SubClass2 extends MultiLevelInheritance {

	SubClass2() {

		str = str.concat("A");
	}
}

class SubClass3 extends SubClass1 {

	SubClass3() {

		str = str.concat("V");
	}
}

class SubClass4 extends SubClass2 {

	SubClass4() {

		str = str.concat("A");
	}

	void display() {

		System.out.println(str);
	}
}

class Test1 {

	public static void main(String args[]) {

		SubClass4 obj = new SubClass4();

		obj.display();
	}
}
