package com.java8.walmart;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String s = "cbapxaleb";
		HashSet set = new HashSet<>();
		// Find the first repeated character
		Optional<Character> firstRepeated = IntStream.range(0, s.length()).mapToObj(s::charAt) // Convert each index to
				.filter(c -> !set.add(c)) // Only allow adding new characters to the Set // a character
				.findFirst(); // Find the first character that cannot be added

		
		if (firstRepeated.isPresent()) {
			System.out.println("First repeated character: " + firstRepeated.get());
		} else {
			System.out.println("No repeated characters found.");
		}

//		
//		Optional<Character> firstRepeatedChar = IntStream.range(0, s.length()).mapToObj(s::charAt)
//				.filter(new HashSet<>()::add)
//				.findFirst();
//		
//		if(firstRepeatedChar.isPresent()) {
//			System.out.println("First Repeated Char : "+firstRepeatedChar.get());
//		}else {
//			System.out.println("No occurences");
//		}
	}
}
