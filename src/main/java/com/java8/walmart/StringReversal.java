package com.java8.walmart;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReversal {
	public static String reverseString(String input) {
		
		IntStream.rangeClosed(0, input.length()).mapToObj( c -> input.charAt(input.length() -1))
		.map(String::valueOf).collect(Collectors.joining());
		
		return IntStream.rangeClosed(1, input.length()).mapToObj(i -> input.charAt(input.length() - i))
				.map(String::valueOf).collect(Collectors.joining());
	}

	public static void main(String[] args) {

		String original = "Hello, World!";
		 String reversed = reverseString(original);
		 System.out.println("Original: " + original);
		 System.out.println("Reversed: " + reversed);

	}
}