package com.moniga.enumdemo.constructor;

import java.util.Arrays;

public class CarConstructorEnumMain {
	public static void main(String[] args) {
		CarConstructorEnum[] variable = CarConstructorEnum.values();
		Arrays.asList(variable).forEach(t -> {
			System.out.println("Car " + t);
			System.out.println("Color " + t.color);
			System.out.println("Seats " + t.seats);
			System.out.println();
		});

		CarConstructorEnum car = CarConstructorEnum.valueOf("SKODA");
		
		System.out.println(car.name());
	}
}
