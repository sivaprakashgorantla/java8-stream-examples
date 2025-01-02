package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorExample {

	public static void main(String[] args) {
		// Create a thread pool with a fixed number of threads (3 in this case)
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// Submit tasks to the thread pool
		for (int i = 1; i <= 10; i++) {
			final int taskId = i;
			executorService.submit(() -> {
				System.out.println(
						"Task " + taskId + " is being executed by thread: " + Thread.currentThread().getName());
				try {
					// Simulate some work with sleep
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.err.println("Task " + taskId + " was interrupted.");
				}
				System.out.println(
						"Task " + taskId + " has been completed by thread: " + Thread.currentThread().getName());
			});
		}

		// Shut down the executor service
		executorService.shutdown();
		System.out.println("All tasks submitted.");
	}
}
