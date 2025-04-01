package com.example.javafxradiobuttondemoweek4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("tasks.txt", true); // true means append mode
        writer.write("Buy groceries\nComplete Assignment\nGo to Gym");
        writer.close();
        System.out.println("Tasks saved to file!");
    }
}
