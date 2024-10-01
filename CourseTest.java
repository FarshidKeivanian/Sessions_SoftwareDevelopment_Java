package course;

public class CourseTest {

	public static void main(String[] args) {
		// Create a Course object
		Course javaCourse = new Course("Introduction to Java");

		// Add students to the course
		javaCourse.addStudent("Alice");
		javaCourse.addStudent("Bob");
		javaCourse.addStudent("Charlie");

		// Display the course name and students enrolled
		System.out.println("Course Name: " + javaCourse.getCourseName());
		System.out.println("Number of Students: " + javaCourse.getNumberOfStudents());

		String[] students = javaCourse.getStudents();
		System.out.println("List of students:");
		for (int i = 0; i < javaCourse.getNumberOfStudents(); i++) {
			System.out.println((i + 1) + ". " + students[i]);
		}
	}
}
