package com.yash.array;

public class Question12 {
	public static void main(String[] args) {
		int a[] = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp1 = a[i] % 10;
				int temp2 = a[j] % 10;
				if (temp1 > temp2) {
					int var = a[i];
					a[i] = a[j];
					a[j] = var;
				}
			}
			System.out.println(a[i]);
		}
	}
}
