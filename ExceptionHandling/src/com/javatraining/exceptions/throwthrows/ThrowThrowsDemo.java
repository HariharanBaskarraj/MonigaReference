package com.javatraining.exceptions.throwthrows;

public class ThrowThrowsDemo {
	public void nullException() throws NullPointerException {
//		String[] stringArray = null;
//		System.out.println(stringArray[2]);
		throw new NullPointerException("I want a null pointer exception to be thrown here");
	}
}
