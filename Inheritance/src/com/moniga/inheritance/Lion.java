package com.moniga.inheritance;

public class Lion extends Animal {
	int years;

	public Lion() {
		super();
	}

	public Lion(String name, String habitat, String color, int weight, int years) {
		super(name, habitat, color, weight);
		this.years = years;
	}

	void calculateFoodAmount(int years) {
		System.out.println("Bonus " + 5 * years);
		System.out.println(this.years);
	}

	@Override
	void getDetails() {
		System.out.println("Name : " + name);
		System.out.println("Habitat : " + habitat);
		System.out.println("Color : " + color);
		System.out.println("Weight : " + weight);
		System.out.println("Years : " + years);
	}
}
