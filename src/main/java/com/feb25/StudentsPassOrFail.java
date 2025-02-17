package com.feb25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private String name;
	private List<Integer> marks;

	public Student(String name, List<Integer> marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public boolean isPassed() {
		return marks.stream().allMatch(mark -> mark >= 35);
	}

	@Override
	public String toString() {
		return "student [name=" + name + "]";
	}

}

public class StudentsPassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = Arrays.asList(
				new Student("Alice", Arrays.asList(40, 50, 60)), // Pass
				new Student("Bob", Arrays.asList(30, 40, 50)), // Fail (30 is not > 30)
				new Student("Charlie", Arrays.asList(35, 45, 55)), // Pass
				new Student("David", Arrays.asList(25, 35, 45)) // Fail (25 is not > 30)
		);

		List<Student> passStudents = students.stream().filter(Student::isPassed).collect(Collectors.toList());

		// Get failing students (at least one mark ≤ 30)
		List<Student> failStudents = students.stream().filter(student -> !student.isPassed())
				.collect(Collectors.toList());

		// Print results
		//System.out.println("Passing Students: " + passStudents);
		//System.out.println("Failing Students: " + failStudents);
		
		
		students.stream()
		.collect(Collectors.partitioningBy(s -> s.isPassed()))
		.forEach((isPass, allStudents) ->{
			System.out.println((isPass ? "Pass" : "Fail") + " : " + allStudents);

		});
		
	}

}
