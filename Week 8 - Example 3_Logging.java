package com.example.trycatchexample;

import java.util.logging.*;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.info("Starting app...");
        logger.warning("This is a warning!");
        logger.severe("Critical issue happened!");
    }
}
