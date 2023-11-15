package com.javatraining.jcf;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Moniga");
		treeSet.add("Arun");
		treeSet.add("Luna");
		treeSet.add("Bala");
		treeSet.add("Murugeswari");
		treeSet.add("Hari");
		treeSet.add("Moniga");  //Duplicates not allowed
//		treeSet.add(null);  //Nulls not allowed
		System.out.println(treeSet);
	}

}
