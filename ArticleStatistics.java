package articleStatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArticleStatistics {

	public static void main(String[] args) {

		// Check if the file name was provided as a command-line argument
		if (args.length == 0) {
			System.out.println("Please provide a file name as a command-line argument.");
			System.out.println("Example: java ArticleStatistics article.txt");
			return;
		}

		String fileName = args[0];

		int lineCount = 0;
		int wordCount = 0;
		int characterCount = 0;

		try {
			File file = new File(fileName);
			Scanner input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();

				lineCount++;
				characterCount += line.length();

				// Remove extra spaces
				String trimmedLine = line.trim();

				if (!trimmedLine.isEmpty()) {
					String[] words = trimmedLine.split("\\s+");
					wordCount += words.length;
				}
			}

			input.close();

			System.out.println("File name: " + fileName);
			System.out.println("Number of characters: " + characterCount);
			System.out.println("Number of words: " + wordCount);
			System.out.println("Number of lines: " + lineCount);

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		}
	}
}
