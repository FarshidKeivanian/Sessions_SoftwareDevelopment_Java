package flexibleLoanCalculator;

public class LoanTest {

	public static void main(String[] args) {
		// Create a Loan object
		Loan loan = new Loan(4.5, 10, 50000);

		// Display the loan details
		System.out.println("Annual Interest Rate: " + loan.getAnnualInterestRate());
		System.out.println("Number of Years: " + loan.getNumberOfYears());
		System.out.println("Loan Amount: " + loan.getLoanAmount());
		System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
		System.out.println("Total Payment: " + loan.getTotalPayment());
		System.out.println("Loan Date: " + loan.getLoanDate());
	}
}
