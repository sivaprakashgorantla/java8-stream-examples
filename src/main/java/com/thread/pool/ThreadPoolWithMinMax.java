package com.thread.pool;

import java.util.concurrent.*;

public class ThreadPoolWithMinMax {
	public static void main(String[] args) {
		// Core pool size (minimum threads)
		int corePoolSize = 2;

		// Maximum pool size
		int maximumPoolSize = 5;

		// Thread keep-alive time for excess threads
		long keepAliveTime = 10;

		// Time unit for keepAliveTime
		TimeUnit timeUnit = TimeUnit.SECONDS;

		// Task queue to hold pending tasks
		BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>(10);

		// Create the ThreadPoolExecutor
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, // Minimum threads
				maximumPoolSize, // Maximum threads
				keepAliveTime, // Time to keep extra threads alive
				timeUnit, // Time unit for keep-alive
				taskQueue // Queue for pending tasks
		);

		// Submit tasks to the thread pool
		for (int i = 1; i <= 15; i++) {
			final int taskId = i;
			threadPoolExecutor.submit(() -> {
				System.out.println(
						"Task " + taskId + " is being executed by thread: " + Thread.currentThread().getName());
				try {
					// Simulate work
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.err.println("Task " + taskId + " was interrupted.");
				}
				System.out.println(
						"Task " + taskId + " has been completed by thread: " + Thread.currentThread().getName());
			});
		}

		// Shutdown the thread pool after all tasks are submitted
		threadPoolExecutor.shutdown();
		System.out.println("All tasks submitted.");
	}
}
