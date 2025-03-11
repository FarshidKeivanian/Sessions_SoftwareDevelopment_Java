import java.util.LinkedList;
import java.util.Scanner;

public class ToDoList {
    private LinkedList<String> tasks;
    
    // Constructor to initialize the LinkedList
    public ToDoList() {
        tasks = new LinkedList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to remove a task by index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Removed task: " + removedTask);
        } else {
            System.out.println("Invalid index! No task removed.");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int index = scanner.nextInt();
                    toDoList.removeTask(index);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
