package com.yash.array;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side1, side2, hypotenuse;
		System.out.print("Enter a value for Side 1: ");
		side1 = sc.nextDouble();
		System.out.print("Enter a value for Side 2: ");
		side2 = sc.nextDouble();
		hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
		System.out.println("The length of the hypotenuse is: " + hypotenuse);
	}
}
