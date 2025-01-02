package com.java8.dec24;

import java.math.BigDecimal;

public class Employee {
	private int eno;
	private String name;
	private int salary;
	private String gender;

	public Employee(int eno, String name, int salary, String gender) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}

}
