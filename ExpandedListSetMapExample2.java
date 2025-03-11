import java.util.*;

public class CollectionActivity {
    public static void main(String[] args) {
        // List Example
        List<String> students = new ArrayList<>(Arrays.asList("Alice", "Bob", "Alice", "David", "Eve", "Charlie"));
        System.out.println("List: " + students);

        // Set Example (Change HashSet to TreeSet for sorting)
        Set<String> uniqueStudents = new TreeSet<>(students);
        System.out.println("Sorted Set (No duplicates): " + uniqueStudents);

        // Map Example (Expanded with more students)
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Eve", 88);
        studentGrades.put("Charlie", 92);

        // Modify a student's grade
        studentGrades.put("Alice", 95);
        System.out.println("Updated Student Grades: " + studentGrades);
    }
}
