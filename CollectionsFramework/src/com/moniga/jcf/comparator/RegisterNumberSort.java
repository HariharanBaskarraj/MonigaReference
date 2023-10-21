package com.moniga.jcf.comparator;

import java.util.Comparator;

public class RegisterNumberSort implements Comparator<Doctor> {

	@Override
	public int compare(Doctor doctorOne, Doctor doctorTwo) {
		// TODO Auto-generated method stub
		return doctorOne.getRegNo().compareTo(doctorTwo.getRegNo());
	}

}
