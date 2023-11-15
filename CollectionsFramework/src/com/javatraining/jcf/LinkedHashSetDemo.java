package com.javatraining.jcf;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Moniga");
		linkedHashSet.add("Arun");
		linkedHashSet.add("Luna");
		linkedHashSet.add("Bala");
		linkedHashSet.add("Murugeswari");
		linkedHashSet.add("Hari");
		linkedHashSet.add("Moniga");  //Duplicates not allowed
		linkedHashSet.add(null);  //Null is allowed
		System.out.println(linkedHashSet);
	}

}
