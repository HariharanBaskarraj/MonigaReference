package com.moniga.jcf.book;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<Book> bookSet = null;
		TitleSort titleSort = new TitleSort();
		IsbnSort isbnSort = new IsbnSort();
		AuthorSort authorSort = new AuthorSort();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input:(T/I/A)");
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("T")) {
			bookSet = new TreeSet<Book>(titleSort);
		} else if (input.equalsIgnoreCase("I")) {
			bookSet = new TreeSet<Book>(isbnSort);
		} else if (input.equals("A")) {
			bookSet = new TreeSet<Book>(authorSort);
		} else {
			System.out.println("Give it coreect!");
		}

		bookSet.add(new Book("Shristi", "1234", "Priya"));
		bookSet.add(new Book("HeadFirst", "4567", "Kathy"));
		bookSet.add(new Book("History", "9876", "Hari"));
		
		bookSet.forEach(ele-> {
			System.out.println(ele);
		});
	}

}
