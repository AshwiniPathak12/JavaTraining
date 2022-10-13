package com.yash;

public class Question6 {
	public static void main(String[] agrs) {
		String s1 = "yash";
		String s2 = new String("yash");
		if (s1.equals(s2) == true) {
			System.out.println("1 object is created in scp");
			System.out.println("2 object is created in heap");
		} else if (s1.equals(s2) == false) {
			System.out.println("Both obj created in scp ");
		}

	}
}
