package com.feb25;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.dec24.Employee;

public class EmployeeOperations {

	public static void allOperations() {
		employeeListToMap();
		employeeSortByKey();
		employeeSortByValues();
		employeeGroupByGender();
	}

	private static void employeeListToMap() {
		// TODO Auto-generated method stub

		System.out.println("-------------employeeListToMap--------------------");
		List<Employee> employeeList = Employee.getEmployeeList();
		employeeList.stream()
		.collect(Collectors.toMap(emp -> emp.getEno(), emp -> emp))
		.forEach((key,values) -> System.out.println(key +" : "+values));
	}
	
	private static void employeeSortByKey() {
		System.out.println("-------------employeeSortByKey--------------------");
		Map<Integer, Employee> employeeMap = Employee.getEmployeeMap();
		employeeMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(entry ->  System.out.println(entry.getKey() +" : "+entry.getValue()));
	}
	
	public static void employeeSortByValues() {
		System.out.println("-------------employeeSortByValues--------------------");
		Map<Integer, Employee> employeeMap = Employee.getEmployeeMap();
		employeeMap
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary)))
		.forEach(entry ->  System.out.println(entry.getKey() +" : "+entry.getValue()));
	}
	public static void employeeGroupByGender() {
		System.out.println("-------------employeeGroupByGender--------------------");
		Map<Integer, Employee> employeeMap = Employee.getEmployeeMap();
		employeeMap
		.entrySet()
		.stream()
		.map(Map.Entry::getValue)
		.collect(Collectors.groupingBy(Employee::getGender))
		.forEach((gender, employees) -> {
            System.out.println(gender.toUpperCase() + " : " + employees);
        });
	}
}
