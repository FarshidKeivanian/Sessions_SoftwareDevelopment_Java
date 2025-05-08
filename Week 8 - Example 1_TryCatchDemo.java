package com.example.trycatchexample;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("ABC"); // Invalid number
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
