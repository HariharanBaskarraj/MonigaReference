package com.moniga.jcf.book;

import java.util.Comparator;

public class TitleSort implements Comparator<Book>{

	@Override
	public int compare(Book bookOne, Book bookTwo) {
		return bookOne.getTitle().compareTo(bookTwo.getTitle());
	    
	}}
