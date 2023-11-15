package com.javatraining.exceptions.types;

import java.util.Scanner;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int numberOne = sc.nextInt();
//		sc.nextLine();

		System.out.println("Enter second number : ");
		int numberTwo = sc.nextInt();
		sc.nextLine();

		normalDivision(numberOne, numberTwo);

		tryDivision(numberOne, numberTwo);

		sc.close();

	}

	public static void normalDivision(int numberOne, int numberTwo) {
		if (numberTwo == 0) {
			System.out.println("/ by zero is not possible");
		} else {
			int divisionResult = numberOne / numberTwo;
			System.out.println("Division Result : " + divisionResult);
		}
	}

	public static void tryDivision(int numberOne, int numberTwo) {
		try { // error prone statements
			int divisionResult = numberOne / numberTwo;
			System.out.println(divisionResult);

			System.out.println(Integer.parseInt("Moniga"));
		} catch (ArithmeticException e) { // handling code
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
