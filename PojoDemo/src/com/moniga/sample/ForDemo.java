package com.moniga.sample;

public class ForDemo {

	public static void main(String[] args) {
		int[] integerArray = new int[5];
		integerArray[0] = 1;
		integerArray[1] = 2;
		integerArray[2] = 3;
		integerArray[3] = 4;
		integerArray[4] = 5;

		// i - Access the index
		for (int i = 0; i < integerArray.length; i++) {
			System.out.println("Index " + i); // Prints the index
			System.out.println("Value " + integerArray[i]); // Print the array value
		}
		System.out.println();

		// i - Access the value
		for (int i : integerArray) {
			System.out.println(i);
		}
	}

}
