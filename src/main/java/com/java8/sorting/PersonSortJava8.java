package com.java8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person{

	private String firstName;
	private String lastName;
	private String email;
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [=" +lastName+" - "+ firstName + "="   + "" + email + "]";
	}
	
}

public class PersonSortJava8{
	public static void main(String[] args) {
		

		Person p1 = new Person("mon","xyz", "xyz@gmail.com");
		Person p2 = new Person("abc","xyz", "xyz@gmail.com");
		Person p3 = new Person("xyz","xyz", "xyz@gmail.com");
		Person p4 = new Person("cba","abc", "abc@gmail.com");
		Person p5 = new Person("ijk","abc", "abc@gmail.com");
		Person p6 = new Person("pqr","abc", "abc@gmail.com");
		Person p7 = new Person("xyz","mno", "mom@gmail.com");
		Person p8 = new Person("ijk","mno", "mon@gmail.com");
		Person p9 = new Person("abc","mno", "mon@gmail.com");
		
		List<Person> list = Arrays.asList(p1, p5, p2,p9, p4, p2, p7, p8,p3, p6);
		
		list.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
		
		list.stream().forEach(System.out::println);
		
	}
}
