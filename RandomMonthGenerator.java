package randomMonthGenerator;

public class RandomMonthGenerator {
    public static void main(String[] args) {
        // Generate a random integer between 1 and 12
        int monthNumber = (int)(Math.random() * 12) + 1;

        // Display the corresponding month name using a switch statement
        String monthName;
        switch (monthNumber) {
            case 1:  monthName = "January";   break;
            case 2:  monthName = "February";  break;
            case 3:  monthName = "March";     break;
            case 4:  monthName = "April";     break;
            case 5:  monthName = "May";       break;
            case 6:  monthName = "June";      break;
            case 7:  monthName = "July";      break;
            case 8:  monthName = "August";    break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October";   break;
            case 11: monthName = "November";  break;
            case 12: monthName = "December";  break;
            default: monthName = "Invalid month"; break; // This should never occur
        }

        // Output the randomly generated month number and corresponding month name
        System.out.println("The randomly generated month number is: " + monthNumber);
        System.out.println("The corresponding month name is: " + monthName);
    }
}
