package employeeWorkSchedule;

// Developer class extends Employee
public class Developer extends Employee {

    // Constructor
    public Developer(String name, int employeeID) {
        super(name, employeeID);
    }

    // Overriding the abstract method workHours()
    @Override
    void workHours() {
        System.out.println(name + " works 40 hours per week.");
    }

    // Additional method: programming languages known by the developer
    public void programmingLanguages(String[] languages) {
        System.out.print(name + " knows the following languages: ");
        for (String language : languages) {
            System.out.print(language + " ");
        }
        System.out.println(); // New line after languages list
    }

    // Additional method: shows the project the developer is currently working on
    public void currentProject(String projectName) {
        System.out.println(name + " is currently working on the project: " + projectName);
    }
}
