package com.javatraining.custom.exceptions;

public class NotPalindromeException extends Exception{

	private static final long serialVersionUID = 1L;

	public NotPalindromeException() {
		super();
	}

	public NotPalindromeException(String message) {
		super(message);
	}

}