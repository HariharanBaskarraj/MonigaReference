package com.javatraining.jcf;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>(5);
		hashSet.add("Moniga");
		hashSet.add("Arun");
		hashSet.add("Luna");
		hashSet.add("Bala");
		hashSet.add("Murugeswari");
		hashSet.add("Hari");
		System.out.println(hashSet);

		hashSet.add(null);
		//Doesnt allow duplicate
		hashSet.add("Moniga");
		System.out.println(hashSet);

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element != null)
				System.out.println(element + "   " + element.hashCode());
		}
		hashSet.forEach(ele-> System.out.println(ele));

	}

}
