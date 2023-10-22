package com.moniga.jcf.book;

import java.util.Comparator;

public class AuthorSort implements Comparator<Book> {

	@Override
	public int compare(Book bookOne, Book bookTwo) {
		return bookOne.getAuthor().compareTo(bookTwo.getAuthor());
	}
   
}
