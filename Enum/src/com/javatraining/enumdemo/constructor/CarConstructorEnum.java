package com.javatraining.enumdemo.constructor;

public enum CarConstructorEnum {
	SKODA("Black", "Five"), TOYOTA("Blue", "Six"), BMW("Red", "Four"), AUDI("White", "Seven");

	String color;
	String seats;

	private CarConstructorEnum(String color, String seats) {
		this.color = color;
		this.seats = seats;
	}
	
}
