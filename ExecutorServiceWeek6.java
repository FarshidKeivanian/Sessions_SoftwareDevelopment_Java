package com.example.concurrent_run_week6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceWeek6 {
    public static void main(String[] args) {
        // Step 1: Create a thread pool with 2 threads
        ExecutorService service = Executors.newFixedThreadPool(2);

        // Step 2: Submit tasks to run in parallel
        service.submit(() -> System.out.println("Task 1 running on " + Thread.currentThread().getName()));
        service.submit(() -> System.out.println("Task 2 running on " + Thread.currentThread().getName()));

        // Step 3: Shutdown the service (good practice)
        service.shutdown();
    }
}
