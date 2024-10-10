package account;

import java.util.Date;

public class Account {

    // Data fields
    private int id;
    private double balance;
    private static double annualInterestRate = 0; // Shared among all accounts
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new Date();
    }

    // Constructor with specified id and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date(); // Account creation date
    }

    // Accessor and Mutator methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to calculate the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to calculate the monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // toString method to return a string representation of the account
    @Override
    public String toString() {
        return "The account id " + id + ", created on " + dateCreated + ", has a current balance of $" 
               + balance + " and a monthly interest of $" + getMonthlyInterest();
    }

    // Main method
    public static void main(String[] args) {
        // Create an account with id 1 and an initial balance of 1000
        Account myAccount = new Account(1, 1000);
        Account.setAnnualInterestRate(4.5); // Setting the annual interest rate to 4.5%

        // Display account details
        System.out.println(myAccount);

        // Withdraw 200 from the account
        myAccount.withdraw(200);
        System.out.println("After withdrawing 200: " + myAccount);

        // Deposit 500 into the account
        myAccount.deposit(500);
        System.out.println("After depositing 500: " + myAccount);
    }
}
