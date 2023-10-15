package com.moniga.inheritance;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal = new Animal("Simbaa","Forest","Brown",150);
		animal.getDetails();
		
		Lion lion = new Lion("Luna","Cave","Ash",3,2);
		lion.calculateFoodAmount(lion.years);
		lion.getDetails();
		
		Tiger tiger = new Tiger("Leo", "Den","Orange",200,5);
		tiger.getDetails();
	}
	
}
