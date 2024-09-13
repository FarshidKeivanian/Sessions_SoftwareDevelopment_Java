package shoppingCostCalculator2;

import javax.swing.JOptionPane;

public class ShoppingCostCalculator2 {

    public static void main(String[] args) {
        // Start the process to read input and compute the average cost
        readAndComputeAvgCost();
    }

    public static void readAndComputeAvgCost() {
        double total = 0;
        int count = Integer.parseInt(JOptionPane.showInputDialog(
            "Enter the number of shopping items:"));

        for (int i = 1; i <= count; i++) {
            double unitPrice = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the unit price of item " + i + ":"));
            double quantity = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the quantity of item " + i + ":"));
            total += getTotal(unitPrice, quantity);
        }

        double averageCost = getAverage(total, count);
        JOptionPane.showMessageDialog(null, String.format("The average cost is %.3f", averageCost));
    }

    public static double getTotal(double uPrice, double qty) {
        return uPrice * qty;
    }

    public static double getAverage(double total, int count) {
        return total / count;
    }
}
