package averageCalculator;

public class AverageCalculator {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int count = 0;

        // While loop to calculate the sum and count the numbers
        while (num <= 100) {
            sum += num;
            count++;
            num += 2;
        }

        // Calculating the average
        double average = (double) sum / count;

        // Displaying the result
        System.out.println("The average using while loop is: " + average);
    }
}
