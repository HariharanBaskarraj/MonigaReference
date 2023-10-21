package com.moniga.jcf.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ComparableImpl {

	public static void main(String[] args) {
		List<Doctor> doctors = new ArrayList<Doctor>();

		doctors.add(new Doctor("Ram", "123", "Surgeon"));
		doctors.add(new Doctor("Vishal", "456", "Neuro"));
		doctors.add(new Doctor("Sam", "789", "Cardio"));
		doctors.add(new Doctor("Hari", "012", "Anaesthesia"));
		
		ListIterator<Doctor> itr = doctors.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();
		Collections.sort(doctors);
		
		ListIterator<Doctor> itr1 = doctors.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
