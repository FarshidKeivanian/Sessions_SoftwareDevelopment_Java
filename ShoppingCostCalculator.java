package shoppingCostCalculator;

import javax.swing.JOptionPane;

public class ShoppingCostCalculator {
    public static void main(String[] args) {
        readAndComputeAvgCost();
    }

    public static void readAndComputeAvgCost() {
        double total = 0;
        int count = Integer.parseInt(JOptionPane.showInputDialog(
            "Enter number of shopping items to buy"));

        for (int i = 1; i <= count; i++) {
            double unitPrice = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter unit price of a shopping item"));
            double quantity = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter quantity of required"));
            total += getTotal(unitPrice, quantity, total);
        }

        System.out.format("The average cost is %.3f", getAverage(total, count));
    }

    public static double getTotal(double uPrice, double qty, double totalAmt) {
        return totalAmt + uPrice * qty;
    }

    public static double getAverage(double total, int count) {
        return total / count;
    }
}
