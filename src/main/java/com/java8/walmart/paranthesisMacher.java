package com.java8.walmart;

import java.util.stream.IntStream;

public class paranthesisMacher {

	public static boolean isBalanced(String input) {
		// Create a stream of characters and check the balance
		return IntStream.range(0, input.length()).mapToObj(input::charAt) // Convert indices to characters
				.map(c -> c == '(' ? 1 : (c == ')' ? -1 : 0)) // Map characters to balance changes
				.reduce(0, (balance, change) -> {
					// If balance goes negative, return immediately as unbalanced
					if (balance + change < 0)
						return Integer.MAX_VALUE;
					return balance + change;
				}) == 0; // Check final balance is zero
	}

	public static void main(String[] args) {
		String input1 = "()()";
		String input2 = "((()";

		System.out.println("Is '" + input1 + "' balanced? " + isBalanced(input1));
		System.out.println("Is '" + input2 + "' balanced? " + isBalanced(input2));
	}

}
