package com.moniga.functionpackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerImpl {

	public static void main(String[] args) {
		// Consumer
		Consumer<String> printConsumer = str -> {
			System.out.println("Consumer received : " + str);
		};

		printConsumer.accept("Moniga");

		// BiConsumer
		BiConsumer<String, Integer> printBiConsumer = (str, num) -> {
			System.out.println(str + " -> " + num);
		};
		printBiConsumer.accept("Age", 30);
	}

}
