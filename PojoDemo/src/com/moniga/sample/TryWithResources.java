package com.moniga.sample;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) { // Try with Resources
			System.out.println("Enter a number to check for prime");
			int toCheck = sc.nextInt();
			int flag = 0; // Prime

			if (toCheck == 0 || toCheck == 1) {
				System.out.println(toCheck + " is not a prime number");
			}

			for (int i = 2; i <= toCheck / 2; i++) {
				System.out.println("Checking " + toCheck + " with " + i);
				if (toCheck % i == 0) {
					System.out.println(toCheck + " is not a prime number");
					flag = 1; // Not Prime
					break;
				}
			}
			if (flag == 0) {
				System.out.println(toCheck + " is a prime number");
			}
		}
	}
}