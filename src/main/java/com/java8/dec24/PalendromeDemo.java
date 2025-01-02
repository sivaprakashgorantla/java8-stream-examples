package com.java8.dec24;

import java.util.stream.IntStream;

public class PalendromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "madam";

		String result = IntStream.range(0, input.length() / 2).allMatch(
				i -> input.charAt(i) == input.charAt(input.length() - i - 1)) ? input + " is palendrome " : input + " is Not palendrome ";
		System.out.println(result);
		
		
		  boolean isPalindrome = IntStream.range(0, input.length()/2)
				  .noneMatch(i -> input.charAt(i) != input.charAt(input.length() - i - 1));
		  String result1 = isPalindrome 
	                ? input + " is a palindrome" 
	                : input + " is not a palindrome";
	        System.out.println(result1);
				
	}

}
