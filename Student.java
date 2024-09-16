/**
 * 
 */
package com.university.management;

/**
 * 
 */
public class Student {
    // Data fields (attributes)
    private String name;
    private String studentID;
    private String[] coursesEnrolled;

    // Default constructor
    public Student() {
        this.name = "";
        this.studentID = "";
        this.coursesEnrolled = new String[0]; // Empty course list
    }

    // Constructor with parameters
    public Student(String name, String studentID, String[] coursesEnrolled) {
        this.name = name;
        this.studentID = studentID;
        this.coursesEnrolled = coursesEnrolled;
    }

    // Method to register for a course
    public void registerForCourse(String course) {
        // Logic to add course to coursesEnrolled
        System.out.println(name + " has registered for " + course);
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
    public String[] getCoursesEnrolled() {
        return coursesEnrolled;
    }

    // Setter for coursesEnrolled
    public void setCoursesEnrolled(String[] coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }
}
