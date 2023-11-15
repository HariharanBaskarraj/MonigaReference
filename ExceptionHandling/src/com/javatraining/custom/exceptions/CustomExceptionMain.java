package com.javatraining.custom.exceptions;

import java.util.Scanner;

public class CustomExceptionMain {
	public static void main(String[] args) throws NotPalindromeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for palindrome:");
		int toCheck = sc.nextInt();
		int temp;
		int reverse = 0;
		int remainder;
		temp = toCheck;
		while (toCheck > 0) {
			remainder = toCheck % 10;
			reverse = (reverse * 10) + remainder;
			toCheck /= 10;
		}
		if (temp == reverse) {
			System.out.println("Yay!! Palindrome....");
		} else {
			sc.close();
			throw new NotPalindromeException("Not a Palindrome!!! Give proper input...");
		}
		sc.close();
	}
}
