package com.javatraining.jcf.book;

public class Book {
	public String title;
	public String iSBN;
	public String author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String iSBN, String author) {
		super();
		this.title = title;
		this.iSBN = iSBN;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", iSBN=" + iSBN + ", author=" + author + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
