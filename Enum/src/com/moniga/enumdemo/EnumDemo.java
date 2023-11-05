package com.moniga.enumdemo;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a direction");
		String input = sc.nextLine();

		try {
			stringToEnum(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			enumToString(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

	public static void stringToEnum(String input) throws IllegalArgumentException {
		Directions[] directions = Directions.values(); // .values() ---> Values as an Array (Enum Type)

		int flag = 0; // Not Present
		Directions direct = Directions.valueOf(input.toUpperCase()); // .valueOf("String") ---> Converts the string to
																		// the Enum Type

		System.out.println("stringToEnum - Is present"); // If the element is not present, then IllegalArgumentException is thrown in
											// the previous line. So, if this line is reached, then for sure the element
											// is present in the enum, so, the below line of codes are not actually
											// required and given here just for a demo of valueOf

		// Checking whether the input given is inside the Enum type
		for (Directions direction : directions) {
			if (direct.equals(direction)) {
				System.out.println("stringToEnum - Is Present");
				flag = 1;
				break;
			}
		}

//		if (flag == 0) {
//			throw new Exception("stringToEnum - Not present");
//		}
	}

	public static void enumToString(String input) throws Exception {
		Directions[] directions = Directions.values(); // .values() ---> Values as an Array (Enum Type)

		int flag = 0; // Not Present

		// Checking whether the input given is inside the Enum type
		for (Directions direction : directions) {
			if (input.equalsIgnoreCase(direction.name())) { // .name() ---> Converts Enum Type to String
				System.out.println("enumToString - Is Present");
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			throw new Exception("enumToString - Not present");
		}
	}
}
