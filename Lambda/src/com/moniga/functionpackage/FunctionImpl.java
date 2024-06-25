package com.moniga.functionpackage;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionImpl {

	public static void main(String[] args) {
		// Function
		Function<String, Integer> stringLength = str -> str.length();
		Function<String, String> stringReturn = str -> str.toUpperCase();

		System.out.println("Length of 'Moniga': " + stringLength.apply("Moniga"));
		System.out.println(stringReturn.apply("Moniga"));

		// BiFunction
		BiFunction<String, String, Integer> concatenateAndLength = (str1, str2) -> (str1 + str2).length();
		System.out.println(
				"Length of concatenation of 'Hello' and 'World': " + concatenateAndLength.apply("Hello", "World"));
		System.out.println(
				"Length of concatenation of 'Java' and 'Function': " + concatenateAndLength.apply("Java", "Function"));

	}

}

// Alternate
interface WithoutFunction {
	void stringFunction(String t);
}

class WithoutFunctionImpl {
	void StringImpl(String t) {
		System.out.println(t);
	}
}