package timedCountdownApp;

import java.util.Scanner;

public class TimedCountdownApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        // Countdown loop
        while (seconds > 0) {
            System.out.println(seconds + " seconds remaining");
            seconds--;

            // Pause for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Countdown was interrupted.");
            }
        }

        // Final message after countdown ends
        System.out.println("Stopped");
    }
}
