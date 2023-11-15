package com.javatraining.jcf.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ComparatorImpl {
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

	System.out.println("\nSorting by name:");
	
	NameSort nameSort = new NameSort();
	Collections.sort(doctors, nameSort);
	ListIterator<Doctor> itr1 = doctors.listIterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	
	System.out.println("\nSorting by reg no:");
	RegisterNumberSort registerNumberSort = new RegisterNumberSort();
	Collections.sort(doctors,registerNumberSort);
	ListIterator<Doctor> itr11 = doctors.listIterator();
	while(itr11.hasNext()) {
		System.out.println(itr11.next());
	}
	
	System.out.println("\nSorting by speciality:");
	SpecialitySort specialitySort = new SpecialitySort();
	Collections.sort(doctors,specialitySort);
	ListIterator<Doctor> itr111 = doctors.listIterator();
	while(itr111.hasNext()) {
		System.out.println(itr111.next());
	}


}
}
