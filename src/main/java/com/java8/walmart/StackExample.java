package com.java8.walmart;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		// Create a stack of integers
		Stack<Integer> stack = new Stack<>();

		// Push elements onto the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack after push operations: " + stack);

		// Peek at the top element without removing it
		System.out.println("Peek top element: " + stack.peek());

		// Pop elements from the stack
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Stack after pop operation: " + stack);

		// Check if the stack is empty
		System.out.println("Is the stack empty? " + stack.isEmpty());

		// Search for an element in the stack
		int position = stack.search(10); // Returns 1-based position
		if (position != -1) {
			System.out.println("Element 10 found at position: " + position);
		} else {
			System.out.println("Element 10 not found in the stack.");
		}

		// Final stack
		System.out.println("Final Stack: " + stack);
	}
}
