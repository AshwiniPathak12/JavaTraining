package com.yash.collectioncurd.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	private String name;
	private int id;
	private String salary;

	Employee() {

	}
	

	public Employee(String name, int id, String salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	
}
