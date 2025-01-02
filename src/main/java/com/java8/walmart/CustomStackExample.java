package com.java8.walmart;

class CustomStack {
	private int[] stack; // Array to store stack elements
	private int top; // Tracks the top of the stack
	private int capacity; // Maximum capacity of the stack

	// Constructor to initialize the stack
	public CustomStack(int size) {
		stack = new int[size];
		capacity = size;
		top = -1; // Stack is empty initially
	}

	// Push method to add an element to the stack
	public void push(int item) {
		if (isFull()) {
			System.out.println("Stack overflow! Cannot add more elements.");
			return;
		}
		stack[++top] = item; // Increment top and add the item
		System.out.println("Pushed: " + item);
	}

	// Pop method to remove and return the top element
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow! Cannot remove elements.");
			return -1; // Return a sentinel value for an empty stack
		}
		System.out.println("Popped: " + stack[top]);
		return stack[top--]; // Return the top element and decrement top
	}

	// Peek method to view the top element without removing it
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty! No top element.");
			return -1;
		}
		return stack[top];
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Check if the stack is full
	public boolean isFull() {
		return top == capacity - 1;
	}
}

public class CustomStackExample {
	public static void main(String[] args) {
		// Create a stack with a capacity of 5
		CustomStack stack = new CustomStack(5);

		// Perform push operations
		stack.push(10);
		stack.push(20);
		stack.push(30);

		// Peek at the top element
		System.out.println("Top element: " + stack.peek());

		// Perform pop operations
		stack.pop();
		stack.pop();

		// Check if the stack is empty
		System.out.println("Is stack empty? " + stack.isEmpty());

		// Pop remaining elements
		stack.pop();
		stack.pop(); // Attempt to pop from an empty stack
	}
}
