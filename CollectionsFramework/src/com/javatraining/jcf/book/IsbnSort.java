package com.javatraining.jcf.book;

import java.util.Comparator;

public class IsbnSort implements Comparator<Book> {

	@Override
	public int compare(Book bookOne, Book bookTwo) {
		return bookOne.getiSBN().compareTo(bookTwo.getiSBN());
	}
   
}
