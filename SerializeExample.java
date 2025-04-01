package com.example.javafxradiobuttondemoweek4;

import java.io.*;

// The Student class must implement Serializable
class Student implements Serializable {
    String name;
    int score;

    // Constructor
    Student(String n, int s) {
        name = n;
        score = s;
    }
}

public class SerializeExample {
    public static void main(String[] args) throws Exception {
        // Create a Student object
        Student s1 = new Student("Alice", 90);

        // Create a stream to write the object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));

        // Serialize the object
        out.writeObject(s1);
        out.close();

        System.out.println("✅ Student serialized!");
    }
}