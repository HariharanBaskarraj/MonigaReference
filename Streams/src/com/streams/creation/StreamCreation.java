package com.streams.creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
	public static void main(String[] args) {
		// Converting a list to a stream
		List<String> welcomeList = Arrays.asList("Hi","everyone.","We","are","discussing","Streams","today");
		Stream<String> listStream = welcomeList.stream();
		
		// Converting an array to a stream
		String[] welcomeArray = new String[] {"Hi","everyone.","We","are","discussing","Streams","today"};
		Stream<String> arrayStream = Stream.of(welcomeArray);
		Stream<Integer> integerArrayStream = Stream.of(new Integer[] {10,20,30,40,50});
		
		// Create an empty stream
		Stream<Integer> emptyStream = Stream.empty();
		
		// Infinite Stream
		Stream<String> infiniteStringStream = Stream.generate(()->{
			return "hello";
		});
		
		Stream<Double> infiniteRandomStream = Stream.generate(Math::random);
	}
}
