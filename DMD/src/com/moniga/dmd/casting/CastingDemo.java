package com.moniga.dmd.casting;

public class CastingDemo {
	public static void main(String[] args) {
		Animal animal = new Dog(); // float x = 3.14
		animal.makeSound();

		Dog dog = (Dog) animal; // int y = (int) a
		dog.play();

		Animal dog2 = dog;
		dog2.makeSound();

		Animal animal2 = new Animal();
		animal2.makeSound();
	}
}
