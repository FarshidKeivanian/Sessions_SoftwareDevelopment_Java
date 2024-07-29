package userInputOutput;
import java.util.Scanner;
public class UserInputOutput {

	public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Process the input and produce output
        System.out.println("Welcome, " + name + "!");
        
        // Close the scanner
        scanner.close();
	}

}
