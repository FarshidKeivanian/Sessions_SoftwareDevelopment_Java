package com.university.management;

public class Main {
    public static void main(String[] args) {
        // Create a new Student object
        String[] courses = {"COMP101", "MATH102", "ENG103"};
        Student student1 = new Student("Alice Smith", "U1234567", courses);

        // Test the methods of the Student class
        student1.registerForCourse("HIST201");
        student1.viewGrades();
        student1.updateProfile("Alice Johnson");

        // New interaction: Dropping a course
        student1.dropCourse("MATH102");

        // Output the current state of the student object
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Courses Enrolled: " + student1.getCoursesEnrolled());
    }
}
