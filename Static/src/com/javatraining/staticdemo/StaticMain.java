package com.javatraining.staticdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaticMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stringToInt(sc);
		sc.close();
	}

	public static void stringToInt(Scanner sc) { // Static Method
		System.out.println("Enter string to convert to integer");
		String toConvert = sc.nextLine();
		System.out.println(Integer.parseInt(toConvert));
	}

	static { // Static Block - Will always be executed first - Even before the main function
		System.out.println("Enter 5 letters");
		Scanner sc = new Scanner(System.in);
		List<String> letters = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			String letter = sc.nextLine();
			letters.add(letter);
		}
		letters.forEach(t -> System.out.println(t));
//		sc.close();
		System.out.println();
	}
}
