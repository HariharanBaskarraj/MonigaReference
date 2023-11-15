package com.javatraining.jcf.doctor;

import java.util.ArrayList;
import java.util.ListIterator;

public class DoctorImpl {

	public static void main(String[] args) {
		ArrayList<Doctor> doctors = new ArrayList<>();

		doctors.add(new Doctor("Ram", "123", "Surgeon"));
		doctors.add(new Doctor("Vishal", "456", "Neuro"));
		doctors.add(new Doctor("Sam", "789", "Cardio"));

		Doctor doc = new Doctor("Hari", "012", "Anaesthesia");
		doctors.add(doc);

		System.out.println(doctors);

		ArrayList<Doctor> doc2 = new ArrayList<>();
		doc2.addAll(doctors);
		System.out.println(doc2);

		doctors.addAll(2, doc2);
		System.out.println(doctors);

		System.out.println(doctors.contains(doc));
		doctors.remove(2);
		System.out.println(doctors);

		doctors.set(1, doc);
		System.out.println(doctors);

		ListIterator<Doctor> itr = doctors.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
