package com.yash;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String :");
		String str = sc.next();
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(ch[i] + " is repeated " + count + " times");

			}
		}
	}
}