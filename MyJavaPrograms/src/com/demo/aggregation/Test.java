package com.demo.aggregation;

import com.demo.aggregation.Author;
import com.demo.aggregation.Book;


class Test {
	public static void main(String args[]) {
		Author ath = new Author("vikash", 22, "India");
		Book b = new Book("Java", 550, ath);
		b.showDetail();
	}
}
