package com.yash.array;

//You are given a sequence of Character in the form of Array. 
//Now you have to put all vowels and consonants together in the array.
public class Question8 {
	public static void main(String[] agrs) {

		String str = "India";

		char[] a = str.toCharArray();
		System.out.println("String is : " + str);
		System.out.print("The vowels are : ");

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

				continue;

			}

			System.out.print(a[i] + ",");

		}

		System.out.println();

		System.out.print("The consonents are : ");

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

				System.out.print(a[i] + ",");

			}

		}
	}

}
