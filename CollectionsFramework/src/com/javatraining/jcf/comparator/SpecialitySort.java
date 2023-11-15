package com.javatraining.jcf.comparator;

import java.util.Comparator;

public class SpecialitySort implements Comparator<Doctor> {

	@Override
	public int compare(Doctor doctorOne, Doctor doctorTwo) {
		// TODO Auto-generated method stub
		return doctorOne.getSpeciality().compareTo(doctorTwo.getSpeciality());
	}

}
