package evenDivisibilityCheck;

import java.util.Scanner;

public class EvenDivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an even integer
        System.out.print("Enter an even integer: ");
        int number = scanner.nextInt();

        // Check if the number is even
        if (number % 2 != 0) {
            System.out.println("Input is not an even number. Please try again.");
        } else {
            // Check if the number is divisible by 3 and 5
            boolean divisibleBy3And5 = (number % 3 == 0) && (number % 5 == 0);

            // Check if the number is divisible by 3 or 5
            boolean divisibleBy3Or5 = (number % 3 == 0) || (number % 5 == 0);

            // Check if the number is divisible by 3 or 5, but not both
            boolean divisibleBy3Or5ButNotBoth = divisibleBy3Or5 && !(divisibleBy3And5);

            // Display the results
            System.out.println("Is " + number + " divisible by 3 and 5? " + divisibleBy3And5);
            System.out.println("Is " + number + " divisible by 3 or 5? " + divisibleBy3Or5);
            System.out.println("Is " + number + " divisible by 3 or 5, but not both? " + divisibleBy3Or5ButNotBoth);
        }

        // Closing the scanner
        scanner.close();
    }
}
