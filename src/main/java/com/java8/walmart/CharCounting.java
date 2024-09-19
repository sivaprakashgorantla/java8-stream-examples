package com.java8.walmart;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharCounting {

	/*
	 * Count the number of Characters in the String
Stringstr = "aaabbaacdddaaeefg" 
output = "a7b2c1d2f2f1g1"
	 * 
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		String str =  "aaabbaacdddaaeefg" ;
		Map<Object, Long> count = str.chars().mapToObj(c -> (char)c ).collect(Collectors.groupingBy(c ->c,LinkedHashMap::new,Collectors.counting()));
		
		String str2 = count.entrySet().stream().map(e-> e.getKey()+""+ (e.getValue() > 1 ? e.getValue() : "" )).collect(Collectors.joining());
		System.out.println("String ; "+str2);
		
		
		String str3 = "aaabbaacdddaaeefg";

        // Count frequency of each character in the string
        Map<Character, Long> charCountMap = str.chars() // Stream of int (characters)
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Output the character counts
        charCountMap.forEach((character, Long) -> System.out.print(character + "" + (Long>1 ? Long : "")));
	}

}
