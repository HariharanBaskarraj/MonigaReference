package com.moniga.varargs;

public class VarargsMain {

	public static void main(String[] args) {
		AverageMarks averageMarks = new AverageMarks();
//		averageMarks.calculateAverage();

		averageMarks.calculateAverage(25, 35, 45, 55, 65);
		averageMarks.calculateAverage(25, 35, 45);
		averageMarks.calculateAverage(100, 95);

		averageMarks.calculateAverage("Moniga", 25, 35, 45, 55, 65);
		averageMarks.calculateAverage("Arun", 25, 35, 45);
		averageMarks.calculateAverage("Bala", 100, 95);
	}

}
