package com.yash.array;

//WAP to find duplicate numbers and there counting from list of numbers.
public class Question2 {
	public static void main(String[] agrs) {
		int s1[] = { 1, 4, 3, 3, 4, 2, 5, 6, 7 };

		int count = 0;
		for (int i = 0; i <= s1.length; i++) {
			for (int j = i + 1; j <= s1.length - 1; j++) {
				if (s1[i] == s1[j]) {
					count++;
					System.out.println("repeated num is " + s1[j] + " count is " + count);

				}

			}

		}
	}
}
