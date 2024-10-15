package employeeWorkSchedule;

public class TestEmployee {
    public static void main(String[] args) {
        // Create an instance of the Developer class
        Developer dev = new Developer("John Doe", 101);
        
        // Call the workHours method
        dev.workHours();  // Output: John Doe works 40 hours per week.
        
        // Call the getSalary method
        dev.getSalary();  // Output: Salary calculated for employee: John Doe.
        
        // Optionally, you can also display the employee's details
        dev.displayDetails();  // Output: Employee Name: John Doe, Employee ID: 101
    }
}
