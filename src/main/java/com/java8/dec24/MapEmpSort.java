package com.java8.dec24;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

public class MapEmpSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(new Employee(1, "Aravind", 50000, "MALE",34),
				new Employee(2, "Rani", 60000, "FIMALE",22), new Employee(3, "Vennella", 55000, "FIMALE",54),
				new Employee(4, "Suresh", 45000, "MALE",35));

		employees.stream().collect(Collectors.toMap(Employee::getName, emp -> emp))
				.forEach((name, emp) -> System.out.println(name + " : " + emp));

		System.out.println("--------------------------------------------------");

		// Create a Map with employee names as the key
		Map<String, Employee> employeeMap = new HashMap<>();
		employeeMap.put("John", new Employee(1, "Aravind", 50000, "MALE",22));
		employeeMap.put("Jane", new Employee(2, "Rani", 60000, "FIMALE",34));
		employeeMap.put("Jake", new Employee(3, "Vennella", 55000, "FIMALE",42));
		employeeMap.put("Jill", new Employee(4, "Suresh", 45000, "MALE",54));

		System.out.println("-------------------------------------key-------------");

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((k, v) -> System.out.println(k + " : " + v));

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey()) // Sort by key (employee name)
				.collect(Collectors.toMap(Map.Entry::getKey, // Key (name)
						Map.Entry::getValue, // Value (Employee object)
						(e1, e2) -> e1, // Merge function in case of duplicate keys (not needed here)
						LinkedHashMap::new // To maintain insertion order after sorting
				)).forEach((key, value) -> System.out.println(key + " : " + value));

		System.out.println("Sort my emp name ----------------------------");
		Map<Integer, Employee> employeeMapName = new HashMap<>();
		employeeMapName.put(1, new Employee(1, "Aravind", 50000, "MALE",34));
		employeeMapName.put(2, new Employee(2, "Rani", 60000, "FIMALE",54));
		employeeMapName.put(3, new Employee(3, "Vennella", 55000, "FIMALE",24));
		employeeMapName.put(4, new Employee(4, "Suresh", 45000, "MALE",43));

		employeeMapName.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((k, v) -> System.out.println(k + " : " + v));

		employeeMapName.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName))) // Sort
																														// by
																														// employee
																														// name
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, // This merge function
																									// is fine if there
																									// are no key
																									// collisions
						LinkedHashMap::new // Ensures insertion order is maintained
				)).forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println("===========================Sort  by Salary====================");

		employeeMapName.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Employee::getSalary)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((key, val) -> System.out.println(key + " -> " + val));

		System.out.println("===========================GROUP By Gender Employees using list====================");
		Map<String, List<Employee>> empGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
		empGender.forEach((gender, empList) -> {
			System.out.println("Gender : " + gender);
			empList.forEach(System.out::println);
		});

		System.out.println("===========================GROUP By Gender Employees using MAP====================");
		Map<String, List<Employee>> genderGroup = employeeMap.values().stream()
				.collect(Collectors.groupingBy(Employee::getGender));

		genderGroup.forEach((gender, emplist) -> {
			System.out.println(gender);
			emplist.forEach(System.out::println);
		});

		System.out.println("===========================Filder based on salary using List=================");
		employeeMapName.values().stream().filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("===========================Filder based on salary using map====================");

		Map<Integer, Employee> highSalaryEmployeeMap = employeeMapName.entrySet().stream()
				.filter(entry -> entry.getValue().getSalary() > 50000)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		highSalaryEmployeeMap.forEach((key, value) -> System.out.println(key + " -> " + value));

		employeeMapName.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((key, value) -> System.out.println(key + " : " + value));
		employeeMapName.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("===========================Filder based on salary using map=== new =================");

		employeeMapName.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((key, value) -> System.out.println(key + " : " + value));

		System.out.println("===========================Filder based on salary using map=== new =================");

		employeeMapName.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println(
				"===========================Filder based on salary using map=== new filgter =================");

		employeeMapName.values().stream().filter(emp -> emp.getSalary() > 50000).forEach(System.out::println);

		System.out.println(
				"===========================Filder based on salary BONUS using map=== new filgter =================");

		employeeMapName.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new))
				.forEach((key, value) -> {
					int bonus = (int)(value.getSalary() * 0.3);
					int newSalary = value.getSalary() + bonus;
			        // Print employee details along with new salary
			        System.out.println(key + " : " + value + " | Bonus: " + bonus + " | New Salary: " + newSalary);
				});
		
		System.out.println("------------------------------------------");
		employeeMapName
		.entrySet()
		.stream()
		.sorted((emp1,emp2) -> Integer.compare(emp2.getValue().getSalary(), emp1.getValue().getSalary()))
		.skip(3)
		.forEach(entry -> System.out.println("3rd Highest Record: " + entry.getKey() + " -> " + entry.getValue()));
	
		System.out.println("------------------17th Dec------------------------");
		
		employeeMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
		.collect(
				Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(m1,m2)->m1,
						LinkedHashMap::new
						
				)).forEach((key,value) -> System.out.println(key+ " : "+ value));
	}

}
