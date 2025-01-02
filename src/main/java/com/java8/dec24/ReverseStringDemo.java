package com.java8.dec24;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "hello";
		System.out.println("Reversed using best wasy: " + reverseBestWay(input));
		System.out.println("Reversed using streams: " + reverseStreams(input));
		

	}

	private static String reverseStreams(String input) {
		// TODO Auto-generated method stub
		return IntStream.range(0, input.length())
				.mapToObj(i ->  input.charAt(input.length()- i -1))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
	}

	private static String reverseBestWay(String input) {
		// TODO Auto-generated method stub
		char[] chars = input.toCharArray();
		int left = 0, right = input.length() - 1;
		
		while(left < right ) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			
			left ++;
			right --;
		}
		return new String(chars);
	}

}
