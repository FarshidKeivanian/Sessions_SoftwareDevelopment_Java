package handlingNegativeandPositiveYearstoDetermineChineseZodiacSign;

public class HandlingNegativeandPositiveYearstoDetermineChineseZodiacSign {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            System.out.println("Enter a year:");
            int year = input.nextInt();
            
            // Adjust the year to ensure it is non-negative
            while (year < 0) {
                year += 12;
            }
            
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
