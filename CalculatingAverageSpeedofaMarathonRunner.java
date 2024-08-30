package calculatingAverageSpeedofaMarathonRunner;

public class CalculatingAverageSpeedofaMarathonRunner {

    public static void main(String[] args) {
        double distance = 42.195; // in kilometers
        int hours = 2;
        int minutes = 40;
        int seconds = 35;

        // Convert time to hours
        double timeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Calculate average speed
        double averageSpeed = distance / timeInHours;

        // Display the result
        System.out.printf("The runner’s average speed is %.2f km/h.%n", averageSpeed);
    }
}
