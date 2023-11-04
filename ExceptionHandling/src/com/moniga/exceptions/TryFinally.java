package com.moniga.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class TryFinally {
	
	public void tryFinallyDemo(String[] inputs) {
		
		System.out.println("Hi");

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter new number :");
			System.out.println(sc.nextInt());

			String name = inputs[1];
			System.out.println(name);

			Integer.parseInt(name); // Exception occurs

		} finally { // Block will be executed no matter what, i.e., Even when an exception occurred
					// or not
			sc.close();
		}

		Arrays.asList(inputs).forEach(t -> System.out.println(t)); // Line will be executed because we have handled the
																	// exception
	}
}
