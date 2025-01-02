package com.thread.pool;

import java.util.concurrent.*;

public class CallableFutureExample {
	public static void main(String[] args) {
		// Create a thread pool with 3 threads
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// Create a Callable task
		Callable<Integer> task = () -> {
			System.out.println("Task is being executed by: " + Thread.currentThread().getName());
			try {
				// Simulate work with sleep
				Thread.sleep(2000); // Task takes 2 seconds
			} catch (InterruptedException e) {
				System.err.println("Task was interrupted");
				Thread.currentThread().interrupt();
				return -1; // Return -1 in case of interruption
			}
			System.out.println("Task completed by: " + Thread.currentThread().getName());
			return 42; // Return a result
		};

		// Submit the task and get a Future object
		Future<Integer> future = executorService.submit(task);

		try {
			System.out.println("Waiting for the task to complete...");
			// Retrieve the result using get() (this blocks until the task is complete)
			Integer result = future.get();
			System.out.println("Task result: " + result);
		} catch (InterruptedException | ExecutionException e) {
			System.err.println("Error occurred while executing the task: " + e.getMessage());
		} finally {
			// Shut down the executor
			executorService.shutdown();
		}
	}
}
