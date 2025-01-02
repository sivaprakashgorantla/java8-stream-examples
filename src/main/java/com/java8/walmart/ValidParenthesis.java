package com.java8.walmart;

import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String s) {
		
		// Create a stack to hold opening brackets
		Stack<Character> stack = new Stack<>();

		// Traverse through each character in the string
		for (char c : s.toCharArray()) {
		
			// If the character is an opening bracket, push it onto the stack
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			
			// If the character is a closing bracket, check if it matches the top of the
			// stack
			
			else if (c == ')' || c == '}' || c == ']') {
				
				// If stack is empty or top of stack doesn't match, return false
				if (stack.isEmpty())
					return false;

				char top = stack.pop();

				// Check for mismatched pairs
				if (c == ')' && top != '(')
					return false;
				if (c == '}' && top != '{')
					return false;
				if (c == ']' && top != '[')
					return false;
			}
		}

		// If stack is empty, all brackets were matched correctly
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String S = "[{()}][]";
		boolean result = isValid(S);
		if (result) {
			System.out.println("The string has valid parentheses.");
		} else {
			System.out.println("The string does not have valid parentheses.");
		}
	}
}
