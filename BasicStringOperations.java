package basicStringOperations;

public class BasicStringOperations {

    public static void main(String[] args) {
        // Combine the strings "north" and "sydney" to "NORTH SYDNEY"
        String str1 = "north";
        String str2 = "sydney";
        String combinedString = str1.toUpperCase() + " " + str2.toUpperCase();

        // Display the combined string
        System.out.println("Combined String: " + combinedString);

        // Display the length of the combined string
        int length = combinedString.length();
        System.out.println("Length of Combined String: " + length);

        // Display the last character of the combined string
        char lastChar = combinedString.charAt(length - 1);
        System.out.println("Last Character of Combined String: " + lastChar);

        // Change the string to "NORTH SHORE" and display it
        combinedString = "NORTH SHORE";
        System.out.println("Updated String: " + combinedString);
    }
}
