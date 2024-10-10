package account;

public class TestAccount {

    public static void main(String[] args) {
        // Create an account with id 123 and an initial balance of $1000
        Account myAccount = new Account(123, 1000);
        
        // Set annual interest rate to 5%
        Account.setAnnualInterestRate(5.0);
        
        // Display account details
        System.out.println(myAccount);
        
        // Deposit $500 into the account
        myAccount.deposit(500);
        
        // Withdraw $300 from the account
        myAccount.withdraw(300);
        
        // Display account details after transactions
        System.out.println(myAccount);
    }
}
