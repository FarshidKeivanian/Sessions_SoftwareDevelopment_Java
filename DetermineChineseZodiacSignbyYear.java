package determineChineseZodiacSignbyYear;

public class DetermineChineseZodiacSignbyYear {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.println("Enter a year:");
			int year = input.nextInt();
			
			int zodiacIndex = year % 12;
			String[] zodiacs = {
			    "Monkey", "Rooster", "Dog", "Pig", 
			    "Rat", "Ox", "Tiger", "Rabbit", 
			    "Dragon", "Snake", "Horse", "Sheep"
			};
			
			System.out.println("The year " + year + " is the year of the " + zodiacs[zodiacIndex] + ".");
		}
    }
}
