package com.java8.walmart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CamelCaseSorter {
    public static void main(String[] args) {
        String input = "gEeksfOraEEkS";
        String sortedCamelCase = sortCamelCase(input);
        System.out.println("Sorted CamelCase: " + sortedCamelCase);
    }

    public static String sortCamelCase(String input) {
        List<Character> lowercaseChars = new ArrayList<>();
        List<Character> uppercaseChars = new ArrayList<>();

        // Separate uppercase and lowercase characters
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseChars.add(ch);
            } else {
                uppercaseChars.add(ch);
            }
        }

        // Sort each list individually
        Collections.sort(lowercaseChars);
        Collections.sort(uppercaseChars);

        // Merge sorted lowercase and uppercase characters in CamelCase order
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < lowercaseChars.size() && j < uppercaseChars.size()) {
            if (lowercaseChars.get(i) < uppercaseChars.get(j)) {
                result.append(lowercaseChars.get(i));
                i++;
            } else {
                result.append(uppercaseChars.get(j));
                j++;
            }
        }

        // Append remaining characters (if any)
        while (i < lowercaseChars.size()) {
            result.append(lowercaseChars.get(i));
            i++;
        }
        while (j < uppercaseChars.size()) {
            result.append(uppercaseChars.get(j));
            j++;
        }

        return result.toString();
    }
}
