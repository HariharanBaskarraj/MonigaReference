package com.javatraining.jcf;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Moniga");
		linkedList.add("Arun");
		linkedList.add("Bala");
		linkedList.add("Hari");

		// Forward
		ListIterator<String> itr = linkedList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Backend
		ListIterator<String> itrTwo = linkedList.listIterator(linkedList.size());
		while (itrTwo.hasPrevious()) {
			System.out.println(itrTwo.previous());
		}

		// addFirst(e)
		linkedList.addFirst("Luna");

		// addLast(e)
		linkedList.addLast("Poodle");
		ListIterator<String> itr3 = linkedList.listIterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		// element()
		System.out.println(linkedList.element());

		// getFirst()
		System.out.println(linkedList.getFirst());

		// getLast()
		System.out.println(linkedList.getLast());

		linkedList.offer("Offer");
		linkedList.offerFirst("OfferFirst");
		linkedList.offerLast("OfferLast");
		linkedList.add("Hari");
		System.out.println(linkedList);

		linkedList.push("Push");
		System.out.println(linkedList);

		linkedList.pop();
		System.out.println(linkedList);

		linkedList.remove();
		linkedList.remove(3);
		linkedList.remove("Poodle");
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);
		
		linkedList.add("Hari");
		linkedList.add("Hari");
		linkedList.add("Hari");
		linkedList.add("Hari");
		linkedList.add("Hari");
		System.out.println(linkedList);
		
		linkedList.removeFirstOccurrence("Hari");
		linkedList.removeLastOccurrence("Hari");
		System.out.println(linkedList);
	}
}
