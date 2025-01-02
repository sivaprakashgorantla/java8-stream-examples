package com.java8.virtusa;
public class StringCompression {
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        
        char currentChar = input.charAt(0);
        
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                System.out.println("REsult : "+result);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        // Append the last character and its count
        result.append(currentChar).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCCBBAA";
        String output = compressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
