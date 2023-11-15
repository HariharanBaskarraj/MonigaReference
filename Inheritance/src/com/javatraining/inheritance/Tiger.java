package com.javatraining.inheritance;

public class Tiger extends Lion {
	int years;

	public Tiger() {
	}

	public Tiger(String name, String habitat, String color, int weight, int years) {
		super(name, habitat, color, weight, years);
		this.years =years;
	}

	void calculateFoodAmount(int years) {
		System.out.println("Bonus " + 5 * years);
		System.out.println(this.years);
	}

	@Override
	void getDetails() {
		
		if (years == 2) {
			super.getDetails();
		}
		
		System.out.println("Name : " + name);
		System.out.println("Habitat : " + habitat);
		System.out.println("Color : " + color);
		System.out.println("Weight : " + weight);
		System.out.println("Years : " + years);
	}
}
