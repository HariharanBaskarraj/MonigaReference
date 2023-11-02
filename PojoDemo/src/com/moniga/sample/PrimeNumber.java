package com.moniga.sample;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to check for prime");
			int toCheck = sc.nextInt();
			int flag = 0;   //Prime
			
			if (toCheck == 0 || toCheck == 1) {
				System.out.println(toCheck + " is not a prime number");
			}

			for (int i = 2; i <= toCheck / 2; i++) {
				System.out.println("Checking "+toCheck+" with "+ i);
				if(toCheck % i == 0) {
					System.out.println(toCheck + " is not a prime number");
					flag = 1;   //Not Prime
					break;
				} 
			}
			if(flag == 0) {
					System.out.println(toCheck + " is a prime number");
			}
			System.out.println("\n\n\n\n\n");
			
//			PrimeNumber number = new PrimeNumber();
//			number.checkTillHundred();
			
			checkTillHundred();
		}
	}
	
	public static void checkTillHundred() {
		for(int toCheck=2;toCheck<100;toCheck++) {
			int flag = 0;   //Prime

			for (int i = 2; i <= toCheck / 2; i++) {
//				System.out.println("Checking "+toCheck+" with "+ i);
				if(toCheck % i == 0) {
//					System.out.println(toCheck + " is not a prime number");
					flag = 1;   //Not Prime
					break;
				} 
			}
			if(flag == 0) {
					System.out.println(toCheck);
			}
		}
	}
}
