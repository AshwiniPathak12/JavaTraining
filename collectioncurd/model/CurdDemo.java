package com.yash.collectioncurd.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class CurdDemo {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------First Project-------------");
		ArrayList<Employee> al = new ArrayList<Employee>();
		int ch;

		do {
			System.out.println("1:Insert");
			System.out.println("2:Display");
			System.out.println("3:Delete");
			System.out.println("4:Search");
			System.out.println("5:Update");

			System.out.println("Enter your choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Employee name:");
				String name = sc.next();
				System.out.println("Enter Employee id:");
				int empid = sc.nextInt();
				System.out.println("Enter Employee salary:");
				String salary = sc.next();

				al.add(new Employee(name, empid, salary));
				break;

			case 2:
				System.out.println("--------------------");
				// System.out.println(al);
				Iterator<Employee> iterator = al.iterator();
				while (iterator.hasNext()) {
					Employee employee = iterator.next();
					System.out.println(employee);
				}
				System.out.println("--------------------");
				break;
			case 3:
				boolean found = false;
				System.out.println("enter emp id which you want to delete");
				int empid2 = sc.nextInt();
				System.out.println("--------------------");
				// System.out.println(al);
				iterator = al.iterator();
				while (iterator.hasNext()) {
					Employee employee = iterator.next();
					if (employee.getId() == empid2) {
						iterator.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println(" Record not exists");
				} else {
					System.out.println(" Record is Deleted");
				}
				System.out.println("--------------------");
				break;

			case 4:
				found = false;
				System.out.println("enter emp id which you want to search");
				empid = sc.nextInt();
				System.out.println("--------------------");
				// System.out.println(al);
				iterator = al.iterator();
				while (iterator.hasNext()) {
					Employee employee = iterator.next();
					if (employee.getId() == empid) {
						System.out.println(employee);
						found = true;
					}
				}
				if (!found) {
					System.out.println(" Record not exists");
				}
				System.out.println("--------------------");
				break;
			case 5:
				found = false;
				System.out.println("enter emp id which you want to update");
				empid = sc.nextInt();
				System.out.println("--------------------");
				// System.out.println(al);
				ListIterator<Employee> li = al.listIterator();
				while (li.hasNext()) {
					Employee employee = li.next();
					if (employee.getId() == empid) {
						System.out.println("Enter new name: ");
						name = sc.next();

						System.out.println("Enter new salary: ");
						salary = sc.next();
						li.set(new Employee(name, empid, salary));
						found = true;
					}
				}
				if (!found) {
					System.out.println(" Record not exists");
				} else {
					System.out.println(" Record is updated");
				}
				System.out.println("--------------------");
				break;

			}

		} while (ch != 0);

	}

}
