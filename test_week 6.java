// File: Test.java
package com.example.concurrent_run_week6;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running!");
    }
}

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();  // Starts the new thread
        System.out.println("Main thread continues...");
    }
}
