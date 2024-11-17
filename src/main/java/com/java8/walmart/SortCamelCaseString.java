package com.java8.walmart;

import java.util.*;
import java.util.stream.Collectors;

public class SortCamelCaseString {

	public static void main(String[] args) {
		String input = "gEeSksfOraEEkS";
		//output =      aEefgkEkrEOsS

		
		// Separate and sort lowercase and uppercase characters
		List<Character> lowercase = input.chars().mapToObj(c -> (char) c).filter(Character::isLowerCase).sorted()
				.collect(Collectors.toList());
		System.out.println("lowercase"+lowercase);
		
		List<Character> uppercase = input.chars().mapToObj(c -> (char) c).filter(Character::isUpperCase).sorted()
				.collect(Collectors.toList());
		System.out.println("uppercase : "+uppercase);

		System.out.println("input : "+input);

		// Merge sorted lowercase and uppercase characters
		StringBuilder result = new StringBuilder();
		
		int lowerIndex = 0, upperIndex = 0;

		// Iterate over original string and place sorted characters in the right case
		// order
		for (char ch : input.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				result.append(lowercase.get(lowerIndex++));
			} else {
				result.append(uppercase.get(upperIndex++));
			}
		}

		System.out.println("Sorted CamelCase String: " + result.toString());
	}
}
