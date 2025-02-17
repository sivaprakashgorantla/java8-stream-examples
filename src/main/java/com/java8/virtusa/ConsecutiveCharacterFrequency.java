package com.java8.virtusa;
import java.util.stream.IntStream;

public class ConsecutiveCharacterFrequency {
    public static void main(String[] args) {
        String input = "AAABBCCAA";

        // Use StringBuilder to build the output string
        StringBuilder output = new StringBuilder();

        // Use IntStream to iterate through the characters
        IntStream.range(0, input.length())
            .forEach(i -> {
                // For the first character or when a different character is encountered
                if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                    // Append the current character and start with count 1
                    output.append(input.charAt(i)).append(1);
                } else {
                    // Increment the count of the last character
                    int lastIndex = output.length() - 1;
                    int count = Character.getNumericValue(output.charAt(lastIndex)) + 1;
                    output.setCharAt(lastIndex, Character.forDigit(count, 10));
                }
            });

        // Print the result
        System.out.println(output.toString()); // Expected output: A3B2C2A2
    }
}
