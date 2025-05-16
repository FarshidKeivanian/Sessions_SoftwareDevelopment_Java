package com.example.trycatchexample;

import java.util.logging.*;

public class LoggerTest {

    private static final Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) {
        logger.info("LoggerTest: Starting application...");
        logger.warning("LoggerTest: Warning issued!");
        logger.severe("LoggerTest: Critical issue occurred!");
    }
}
