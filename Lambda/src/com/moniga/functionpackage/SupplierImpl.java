package com.moniga.functionpackage;

import java.util.function.Supplier;

public class SupplierImpl {
	public static void main(String[] args) {
		Supplier<Integer> randomSupplier = () -> 1 + (int) (Math.random() * 6);

		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());

	}
}
