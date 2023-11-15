package com.javatraining.inheritance;

public class Animal {
	String name;
	String habitat;
	String color;
	int weight;

	public Animal() {
		super();
	}
	

	public Animal(String name, String habitat, String color, int weight) {
		super();
		this.name = name;
		this.habitat = habitat;
		this.color = color;
		this.weight = weight;
	}


	void getDetails() {
		System.out.println("Name :" + name);
		System.out.println("Habitat :" + habitat);
		System.out.println("Color :" + color);
		System.out.println("Weight :"+ weight);
	}
	
	
}