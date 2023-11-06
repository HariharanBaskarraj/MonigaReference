package com.moniga.internalOne;

public class Status {

	public static void main(String a[]) {
		int[] x[] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		int[][] y = x;
		for (int row = 0; row < y.length; row++) {
			for (int col = 0; col < y[row].length; col++) {
				System.out.println("Row " + row + " Column " + col + " , Value = " + y[row][col]);
			}
		}
		System.out.println(y[2][1]);
	}

}
