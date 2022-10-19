package com.yash.array;

import java.util.Arrays;

public class Question6 {
	public static void main(String[] agrs) {
		int[] a = { 2, 5, 4, 6, 7, 8, 9, 0, 1, 3 };
		int length = a.length;
		System.out.println("length of array is: " + length);

		Arrays.sort(a);

		for (int i = 0; i <= length / 2; i++) {
			System.out.println(+a[i]);
		}

		for (int j = a.length - 1; j > length / 2; j--) {
			System.out.println(+a[j]);
		}
	}
}
