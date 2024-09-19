package articleStatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArticleStatistics {

    public static void main(String[] args) {
        // Check if the file name is provided as an argument
        if (args.length != 1) {
            System.out.println("Please provide a file name as a command-line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            // Open the file and scan line by line
            Scanner fileScanner = new Scanner(file);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;
                charCount += line.length(); // Count the characters in the line
                wordCount += line.split("\\s+").length; // Split line into words using whitespace
            }
            fileScanner.close();
            
            // Print the results
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
            
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("File not found: " + fileName);
        }
    }
}
