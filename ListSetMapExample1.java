import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // List Example
        List<String> students = new ArrayList<>(Arrays.asList("Alice", "Bob", "Alice", "David"));
        System.out.println("List: " + students);

        // Set Example (removes duplicates)
        Set<String> uniqueStudents = new HashSet<>(students);
        System.out.println("Set (No duplicates): " + uniqueStudents);

        // Map Example
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        System.out.println("Student Grades: " + studentGrades);
    }
}
