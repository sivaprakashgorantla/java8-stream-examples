package com.feb25;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharOperations {
	public static void charactorOperations() {
		charCount();
		reverseString();
		charFrequency();
		nonReparedChar();
		palendrome();
		reverseWords();
	}
	private static void palendrome() {
		// TODO Auto-generated method stub
		String str = "MADAM";
		boolean allMatch = IntStream.range(0, str.length()/2)
		.allMatch( i -> str.charAt(i) == str.charAt(str.length() -i -1));
		
		System.out.println("Palendrom : "+allMatch);
	}

	private static void nonReparedChar() {
		// TODO Auto-generated method stub
		String str ="Rama is a good boy.";
		Character orElse = str.chars()
		.mapToObj(ch ->(char) ch)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() ==1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse( null);
		System.out.println("orElse : "+orElse);
	}

	private static void charFrequency() {
		// TODO Auto-generated method stub
		String input ="AAABBCCAA";
		StringBuilder output = new StringBuilder();
		IntStream.range(0, input.length())
		.forEach(i -> {
			if(i==0 || input.charAt(i) != input.charAt(i-1)) {
				output.append(input.charAt(i)).append(1);
			}else {
				int index = output.length() -1;
				int count = Character.getNumericValue(output.charAt(index));
				output.setCharAt(index, Character.forDigit(count+1, 10));
			}
		});
		System.out.println("Char Fequency : "+output);
	}

	private static void reverseString() {
		// TODO Auto-generated method stub
		String input = "Sivaprakash Gorantla";
		String revserseString = IntStream.range(0, input.length())
		.mapToObj(i  -> input.charAt(input.length() - 1 - i  ))
		.collect(StringBuilder::new, StringBuilder::append,StringBuilder::append)
		.toString();
		
		System.out.println("revserseString : "+revserseString);
		
		System.out.println("Another way ");
		String revserseString2 = Arrays.stream(input.split(""))
		.sorted((a,b) -> -1)
		.collect(Collectors.joining(""));

		System.out.println("revserseString2 : "+revserseString2);
		

		System.out.println("Another way 3 ");
		
		String revserseString3 = input.chars()
		.mapToObj(ch -> (char) ch)
		.collect(Collectors.collectingAndThen(
				Collectors.toList(), 
				list -> {
					Collections.reverse(list);
					return list.stream();
				}
				))
		.map(String::valueOf)
		.collect(Collectors.joining(""));
		System.out.println("revserseString3 collectingAndThen: "+revserseString3);
		
	}

	private static void charCount() {
		// TODO Auto-generated method stub
		String input = "Rama is a good boy";
		input.chars()
		.mapToObj(ch -> (char) ch)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((key,value) -> System.out.println(key+" : "+value));
	}
	
	private static void reverseWords() {
		String input ="siva,prakash,gorantla,rahul";
		String collect = Stream.of(input.split(","))
		.map(word -> {
			return new StringBuilder(word).reverse().toString();
		}).collect(Collectors.joining(","));
		System.out.println("Reverse words : "+collect);
	}
	
}
