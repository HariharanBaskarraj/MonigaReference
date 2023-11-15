package com.javatraining.jcf.doctor;

public class Doctor {

	public String doctorName;
	public String regNo;
	public String speciality;

	public Doctor() {
		super();
	}

	public Doctor(String doctorName, String regNo, String speciality) {
		super();
		this.doctorName = doctorName;
		this.regNo = regNo;
		this.speciality = speciality;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", regNo=" + regNo + ", speciality=" + speciality + "]";
	}

}
