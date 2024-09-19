package commonLetters;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonLetters {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Input for the first list of characters
        System.out.print("Enter the number of elements for list1: ");
        int list1Size = input.nextInt();
        System.out.print("Enter list1: ");
        ArrayList<Character> list1 = new ArrayList<>();
        for (int i = 0; i < list1Size; i++) {
            String str = input.next();  // read individual characters as string
            list1.add(str.charAt(0));   // convert string to char and add to list
        }

        // Input for the second list of characters
        System.out.print("Enter the number of elements for list2: ");
        int list2Size = input.nextInt();
        System.out.print("Enter list2: ");
        ArrayList<Character> list2 = new ArrayList<>();
        for (int i = 0; i < list2Size; i++) {
            String str = input.next();
            list2.add(str.charAt(0));   // convert string to char and add to list
        }

        // Find and retain common elements between list1 and list2
        list1.retainAll(list2);

        // Display the common elements
        System.out.print("The common elements are: ");
        for (Character ch : list1) {
            System.out.print(ch + " ");
        }

        input.close();  // Close the scanner
    }
}
