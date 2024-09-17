package com.university.management;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    // Data fields (attributes)
    private String name;
    private String studentID;
    private ArrayList<String> coursesEnrolled;

    // Default constructor
    public Student() {
        this.name = "";
        this.studentID = "";
        this.coursesEnrolled = new ArrayList<>(); // Empty course list
    }

    // Constructor with parameters
    public Student(String name, String studentID, String[] coursesEnrolled) {
        this.name = name;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>(Arrays.asList(coursesEnrolled));
    }

    // Method to register for a course
    public void registerForCourse(String course) {
        // Logic to add course to coursesEnrolled
        coursesEnrolled.add(course);
        System.out.println(name + " has registered for " + course);
    }

    // **New Method** to drop a course
    public void dropCourse(String course) {
        if (coursesEnrolled.remove(course)) {
            System.out.println(name + " has dropped " + course);
        } else {
            System.out.println(name + " is not enrolled in " + course);
        }
    }

    // Method to view grades (dummy implementation)
    public void viewGrades() {
        System.out.println(name + " is viewing grades.");
    }

    // Method to update student profile
    public void updateProfile(String newName) {
        this.name = newName;
        System.out.println("Profile updated to: " + newName);
    }

    // Getter for studentID
    public String getStudentID() {
        return studentID;
    }

    // Setter for studentID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for coursesEnrolled
    public ArrayList<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    // Setter for coursesEnrolled
    public void setCoursesEnrolled(ArrayList<String> coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }
}
