package totalInvoiceCalculator;

import java.util.Scanner;

public class TotalInvoiceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the subtotal and gratuity rate from the keyboard
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();

        // Calculating the gratuity
        double gratuity = subtotal * (gratuityRate / 100);

        // Calculating the total
        double total = subtotal + gratuity;

        // Displaying the results
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
        
        // Closing the scanner
        scanner.close();
    }
}
