/* Create a program in which two string is input by the user and after that user will enter index in 
first string where we want to insert the second string and insert the second string at that index 
and create a new string */

package com.yash;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 st String");
		String str1 = scanner.next();
		System.out.println("Enter 2 st String");
		String str2 = scanner.next();
		System.out.println("enter the index");
		int index = scanner.nextInt();

		String temp = "";
		String newstr = "";
		for (int i = 0; i < str1.length(); i++) {
			newstr = newstr + str1.charAt(i);
			if (i == index) {
				temp = newstr + str2;
			}

		}
		System.out.println(temp);

	}

}
