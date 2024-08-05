package com.atlassian.config;

public class Configuration {
    public static void main(String[] args) {
        int maxRetries = 5; // Maximum number of retry attempts
        long timeout = 1000000L; // Timeout duration in milliseconds
        double version = 1.1; // Software version

        System.out.println("Max Retries: " + maxRetries);
        System.out.println("Timeout: " + timeout + " ms");
        System.out.println("Version: " + version);
 }
}
