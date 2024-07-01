package com.streams.operations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Bala", "Murugeswari", "Arun", "Moniga", "Hari", "Luna");
		Stream<String> nameStream = namesList.stream();

		// filter - Intermediate Operation
		Stream<String> filteredNames = nameStream.filter((n) -> n.length() > 4);

		// iterator - Terminal Operation
		Iterator<String> iterator = filteredNames.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

		// forEach
		namesList.stream().filter((n) -> n.length() > 4).forEach(System.out::println);
		System.out.println();

		// map, sorted
		namesList.stream().filter((n) -> n.length() > 4).map(String::toUpperCase).sorted().forEach(System.out::println);
		System.out.println();

		// flatMap
		String[][] arrayTwoD = new String[][] { { "Moniga", "Arun" }, { "Darshini", "Hari" } };
		// String[][] to String[]
		Stream<String[]> arrayTwoDOneLevel = Arrays.stream(arrayTwoD);
		// String[] to String
		Stream<String> arrayTwoDLastLevel = arrayTwoDOneLevel.flatMap((one) -> Arrays.stream(one));
		arrayTwoDLastLevel.map((x) -> x.toUpperCase()).forEach(System.out::println);
		System.out.println();
		Stream<String> arrayTwoDLastLevelMethodReference = Arrays.stream(arrayTwoD).flatMap(Arrays::stream);
		arrayTwoDLastLevelMethodReference.map((x) -> x.toUpperCase()).forEach(System.out::println);
		System.out.println();

		// limit
		Stream<Double> infiniteDoubleStream = Stream.generate(Math::random).limit(10);
		Iterator<Double> iteratorDouble = infiniteDoubleStream.iterator();
		while (iteratorDouble.hasNext()) {
			System.out.println(iteratorDouble.next());
		}
		System.out.println();

		// skip
		Stream<Double> infiniteDoubleTwoStream = Stream.generate(Math::random).limit(10).skip(3);
		Iterator<Double> iteratorDoubleTwo = infiniteDoubleTwoStream.iterator();
		while (iteratorDoubleTwo.hasNext()) {
			System.out.println(iteratorDoubleTwo.next());
		}
		System.out.println();
	}
}
