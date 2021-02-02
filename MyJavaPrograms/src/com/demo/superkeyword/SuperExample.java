package com.demo.superkeyword;

public class SuperExample {

	int a = 100;
}

class Super1 extends SuperExample {
	int a = 200;

	void Show() {
		System.out.println(super.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		new Super1().Show();
	}
}
