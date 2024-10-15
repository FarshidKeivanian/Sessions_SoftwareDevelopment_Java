package employeeWorkSchedule;

abstract class Employee {
    String name;
    int employeeID;

    // Constructor
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    // Abstract method
    abstract void workHours();

    // Concrete method
    void getSalary() {
        System.out.println("Salary calculated for employee: " + name);
    }

    // Additional method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name + ", Employee ID: " + employeeID);
    }
}
