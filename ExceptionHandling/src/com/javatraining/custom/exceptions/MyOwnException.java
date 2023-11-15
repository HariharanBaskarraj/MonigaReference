package com.javatraining.custom.exceptions;

public class MyOwnException extends Exception{

	private static final long serialVersionUID = 1L;

	public MyOwnException() {
		super();
	}

	public MyOwnException(String message) {
		super(message);
	}

}