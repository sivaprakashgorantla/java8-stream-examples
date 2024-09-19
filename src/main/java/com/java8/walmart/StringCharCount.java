package com.java8.walmart;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Sivaprakash is a Goodboy.  He was scilent and listen. ";

		Map<Character, Long> map = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.forEach((character,count) -> System.out.println(character +" : " +count));
	}

}
