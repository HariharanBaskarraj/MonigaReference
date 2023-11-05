package com.moniga.exceptions;

public class ThrowThrowsMain {
	public static void main(String[] args) {
		ThrowThrowsDemo demo = new ThrowThrowsDemo();
		try {
			demo.nullException();
			System.out.println("This will not be printed");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hi");
//		demo.nullException();
	}
}
