package com.moniga.exceptions.types;

import java.util.Arrays;
import java.util.List;

public class CompileTimeExceptionDemo {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {// DECLARING AN EXCEPTION

		// HANDLING THE EXCEPTION
		try {
			Class.forName("String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Integer a[] = new Integer[5];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
//		a[5] = 5;
//		a[6] = 6;
//		a[7] = 10;

		List<Integer> list = Arrays.asList(a);
		list.forEach(t -> System.out.println(t.toString()));
	}
}
