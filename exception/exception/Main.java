package com.exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] agrs) throws failException, NegativeMarkException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students");
		int size = sc.nextInt();

		Student student = new Student();
		System.out.println("Enter Student details:- ");

		for (int i = 0; i < size; i++) {
			Student s1 = new Student();

			System.out.println("enter Student roll");
			int roll = sc.nextInt();
			System.out.println("enter Student name");
			String name = sc.next();
			System.out.println("enter Student address");
			String address = sc.next();

			StudentResult sr = new StudentResult();
			s1.setRollno(roll);
			s1.setSname(name);
			s1.setSaddress(address);
			sr.getavg();

		}

	}

}
