package com.javatraining.exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(12 / 0);
			System.out.println(Integer.parseInt("Moniga"));
			System.out.println(Class.forName("String"));
		} catch (ArithmeticException | NumberFormatException | ClassNotFoundException e) { // Same level hierachy should
																							// be maintained
			e.printStackTrace();
		}
	}

}
