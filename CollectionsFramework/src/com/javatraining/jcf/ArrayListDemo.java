package com.javatraining.jcf;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();

		// add(e)
		list.add("Moniga");
		list.add("Arun");
		list.add("Bala");
		list.add("linga");
		list.add(5);
		list.add(24.0);
		list.add(new Date());
		list.add(null);
		list.add(null);
		System.out.println(list);

		// add(i,e)
		list.add(2, "Hari");
		System.out.println(list);

		// addAll(c)
		ArrayList list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println(list2);

		// addAll(i,c)
		list.addAll(3, list2);
		System.out.println(list);

		// clear()
		list2.clear();
		System.out.println(list2);

		// clone()
		list2 = (ArrayList) list.clone();
		System.out.println(list2);

		// contains(o)
		System.out.println(list.contains("Moniga"));

		// containsAll(c)
		ArrayList list3 = new ArrayList<>();
		list3.add("Moniga");
		list3.add("Arun");
		System.out.println(list.containsAll(list3));
		ArrayList list4 = new ArrayList<>();
		list4.add("Bala");
		list4.add("linga");
		System.out.println(list.containsAll(list4));

		// equals(o)
		System.out.println(list.equals(list2));
		System.out.println(list.equals(list3));

		// forEach
		list.forEach(ele -> {
			System.out.println("\nInside Lambda");
			System.out.println(ele);
		});

		// get(i)
		System.out.println(list.get(0));

		// indexOf(o)
		System.out.println(list.indexOf("Arun"));

		// isEmpty
		System.out.println(list.isEmpty());
		System.out.println(!list.isEmpty());

		// iterator()
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// listIterator()
		ListIterator litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println();
		// listIterator(i)
		// size()
		litr = list.listIterator(list.size());
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		// remove(i)
		list.remove(4);
		System.out.println(list);

		// remove(o)
		list.remove("Moniga");
		System.out.println(list);

		// removeAll(c)
		list.removeAll(list4);
		System.out.println(list);

		// set(i,o)
		list.set(1, "Luna");
		System.out.println(list);

	}
}
