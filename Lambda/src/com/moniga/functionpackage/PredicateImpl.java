package com.moniga.functionpackage;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateImpl {
	public static void main(String[] args) {
//		int num = 2;
//		System.out.println(num % 2 == 0);

		// Predicate
		Predicate<Integer> isEvenSingle = num -> num % 2 == 0;

		Predicate<Integer> isEven = num -> {
			return num % 2 == 0;
		};

		System.out.println("Is 4 even? " + isEven.test(4));
		System.out.println("Is 7 even? " + isEvenSingle.test(7));
		
		// BiPredicate
		BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1 + num2) % 2 == 0;

        System.out.println("Is sum of 2 and 4 even? " + isSumEven.test(2, 4));
        System.out.println("Is sum of 3 and 5 even? " + isSumEven.test(3, 4));
	}
}
