package course;

public class Course {

  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    // Left as an exercise in Exercise 10.9
  }
  
  public static void main(String[] args) {
    // Test the Course class
    Course course = new Course("Java Programming");
    
    // Adding students
    course.addStudent("Alice");
    course.addStudent("Bob");
    course.addStudent("Charlie");
    
    // Displaying course details
    System.out.println("Course Name: " + course.getCourseName());
    System.out.println("Number of Students: " + course.getNumberOfStudents());
    
    // Displaying student names
    String[] students = course.getStudents();
    System.out.println("Enrolled Students:");
    for (int i = 0; i < course.getNumberOfStudents(); i++) {
      System.out.println(students[i]);
    }
  }
}
