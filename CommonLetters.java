package digitCount;

import java.util.Scanner;

public class DigitCount {

    // Method to count occurrences of each digit (0-9) in the number
    public static int[] count(long num) {
        int[] digitCounts = new int[10]; // Array to hold counts for digits 0-9

        // Convert the long number to a string
        String numStr = Long.toString(num);

        // Loop through each character in the string
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i); // Get each character
            int digit = Character.getNumericValue(ch); // Convert char to int
            digitCounts[digit]++; // Increment the count for this digit
        }
        return digitCounts;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        long number = input.nextLong(); // Read long number from input

        // Call the count method to get digit counts
        int[] counts = count(number);

        // Display the result for each digit
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println("Digit " + i + " occurs " + counts[i] + " time(s)");
            }
        }
        input.close();
    }
}
