package com.exception;

public class Student {

	private static int rollno;
	private static String sname;
	private static String saddress;
	private static StudentResult srobj;

	public static void Display() {
		System.out.println("roll no is:" + rollno + " sname is:" + sname + " saddress is:" + saddress);

	}

	public Student() {

	}

	public Student(int rollno, String sname, String saddress, StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public StudentResult getSrobj() {
		return srobj;
	}

	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}

}
