package com.java8.dec24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	private int eno;
	private String name;
	private int salary;
	private String gender;
	private int age;

	

	public Employee(int eno, String name, int salary, String gender, int age) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", age=" + age
				+ "]";
	}


	public static List<Employee> getEmployeeList(){
		List<Employee> employeeList = Arrays.asList(
				new Employee(3, "ABC", 50000, "Male", 30),
	            new Employee(4, "XYZ", 60000, "Female", 28),
	            new Employee(1, "PQR", 65000, "Male", 35),
	            new Employee(2, "MNO", 70000, "Female", 32)
				);
		return employeeList;
	}

	public static Map<Integer,Employee> getEmployeeMap(){
		return Employee.getEmployeeList().stream()
		.collect(Collectors.toMap(emp -> emp.getEno(), emp -> emp));
	}

}
