package com.exception5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketBook {

	List<String> listname = new ArrayList<String>();
	ArrayList<Integer> arrayage = new ArrayList<Integer>();
	List<String> listaddr = new ArrayList<String>();

	private static int tiki = 10;
	int age;
	Scanner sc = new Scanner(System.in);

	public void normal() throws Exception, OutOfNormalTicketException, AgeGroupException {

		System.out.println(ANSI_RESET + "\n How many ticket want");
		int t = sc.nextInt();

		try {
			if (t > 6) {
				throw new OutOfNormalTicketException(ANSI_GREEN + " Sorry ! You Cannot Book More than 6 ticket ");
			} else {

				try {

					System.out.println("Enter age of Booking person");
					int ag = sc.nextInt();
					if (ag < 18) {
						throw new Exception("age invalid for booking");
					} else {

						for (int i = 0; i < t; i++) {
							System.out.println("Enter name for " + (i + 1) + " ticket");
							String name = sc.next();

							System.out.println("Enter Adress for " + (i + 1) + " ticket");
							String addr = sc.next();

							System.out.println("Enter Age for " + (i + 1) + " ticket");
							try {
								if ((age = sc.nextInt()) < 5) {
									throw new AgeGroupException("Age Should be above 5");
								}
							} catch (AgeGroupException eg) {

								System.out.print(eg.getMessage());
								System.out.print(ANSI_GREEN + "Book again" + ANSI_RESET);

								normal();
							}

							tiki--;

							listname.add(name);
							listaddr.add(addr);
							arrayage.add(age);
						}

					}
				} catch (Exception e) {
					System.out.println(e.getMessage());

				}
			}
		} catch (OutOfNormalTicketException ee) {

			System.out.println(ee.getMessage() + " Again Book the Ticket");

			normal();
		}

		// System.out.println("Name = "+listt+" Age = "+array);

		System.out.println(tiki + " Ticket Available");

		for (String l1 : listname) {

			System.out.println("Name " + l1);

		}
		for (int a1 : arrayage) {
			System.out.println("Age " + a1);
		}

		for (String ld : listaddr) {
			System.out.println("Adress " + ld);
		}
	}

	public static final String ANSI_GREEN = "\u001B[34 m";
	public static final String ANSI_RESET = "\u001B[0 m";

	String name[] = new String[10];
	String addr[] = new String[10];
	int age1[] = new int[10];

	public void tatkal() throws Above4tatkalBookingException, Exception {
		System.out.println("Enter the Ticket");
		int tat = sc.nextInt();

		try {
			if (tat >= 4) {
				throw new Above4tatkalBookingException(
						ANSI_GREEN + "you can not book more than 4 Ticket for tatkal" + ANSI_RESET);
			} else {

				for (int i = 0; i < tat; i++) {
					System.out.println("Enter name");
					name[i] = sc.next();
					System.out.println("Enter Address");
					addr[i] = sc.next();
					System.out.println("Enter Age");

					try {
						if ((age1[i] = sc.nextInt()) <= 5) {
							throw new Exception("Age Should be above 5");
						}
					} catch (Exception e) {
						System.out.print(e.getMessage());
						System.out.print("Book Again");
					}

					tiki--;

				}

			}
		} catch (Above4tatkalBookingException ee) {
			System.out.println(ANSI_GREEN + ee.getMessage() + ANSI_RESET);
			System.out.println("Book again");
			tatkal();
		}

		for (int i = 0; i < tat; i++) {
			System.out.println("\n Name of " + (i + 1) + " person     :-  " + name[i]);
			System.out.println("Address of " + (i + 1) + " person  :-  " + addr[i]);
			System.out.println("Age of " + (i + 1) + " person     :-  " + age1[i] + "\n");
		}

	}

	public static void main(String[] args) throws Exception {

		TicketBook tk = new TicketBook();
		int b;
		do {
			System.out.println("\n 1.Normal Booking \n" + " 2.Tatkal Booing  \n" + " 0. Exit ");
			Scanner sc = new Scanner(System.in);
			b = sc.nextInt();
			switch (b) {
			case 1:
				tk.normal();
				break;

			case 2:

				tk.tatkal();
				break;

			case 0:
				System.out.println("=========================");
				System.out.println("|| " + "Thank You for Visit" + " ||");
				System.out.println("=========================");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid No");
			}
		} while (b <= 2);

	}

}
