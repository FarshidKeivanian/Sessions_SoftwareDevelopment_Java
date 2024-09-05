package mixedFractionCalculator;

public class MixedFractionCalculator {
    public static void main(String[] args) {
        int numerator = 19;
        int denominator = 3;

        // Calculating whole number quotient
        int quotient = numerator / denominator;

        // Calculating the remainder which is the numerator of the mixed fraction
        int remainder = numerator % denominator;

        // Displaying the results
        System.out.println("Whole number quotient is: " + quotient);
        System.out.println("The numerator of the mixed fraction is: " + remainder);
        System.out.println("The denominator of the mixed fraction is: " + denominator);
    }
}
