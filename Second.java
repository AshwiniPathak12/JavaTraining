//WAP to print the all alphabets of string in ascending and descending order.
package com.yash;

public class Second {
	public static void main(String[] agrs) {
		String s = "ashwini";
		char s1[] = s.toCharArray();

		System.out.println("asending order");
		for (int i = 0; i <= s1.length - 1; i++) {
			for (int j = i + 1; j <= s1.length - 1; j++) {
				if (s1[i] >= s1[j]) {
					char temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}

			}

			System.out.println(" " + s1[i]);

		}

		System.out.println(" ");
		System.out.println("The String Characters In Descending Orders Are :");
		for (int i = 0; i < s1.length; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] < s1[j]) {
					char temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
			System.out.print(s1[i] + " ");
		}
	}

}
