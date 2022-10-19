package com.yash.array;

//WAP to find third maximum number from list of numbers.
public class Question1 {
	public static void main(String[] agrs) {
		int a[] = { 3, 4, 5, 2, 7, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			// System.out.println(a[i]);

		}
		int max = a[a.length - 3];
		System.out.println("third maximum number is: " + max);

	}
}
