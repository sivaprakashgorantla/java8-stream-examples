package com.java8.virtusa;
import java.util.*;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "AAABBCCAA";

        String output = Arrays.stream(input.split(""))
            .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .map(e -> e.getKey() + String.valueOf(e.getValue()))
            .collect(Collectors.joining());

        System.out.println(output); // Output: A3B2C2A2
    }
}
