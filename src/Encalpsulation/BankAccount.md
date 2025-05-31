package Encalpsulation;

public class BankAccount {
private String accountHolder;
private double balance;

    // Constructor to initialize account holder and initial balance
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = Math.max(initialBalance, 0); // Ensure balance is non-negative
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println(amount > balance ? "Insufficient funds." : "Withdrawal amount must be positive.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.printf("Account Holder: %s%nBalance: %.2f%n", accountHolder, balance);
    }

    // Main method for testing the BankAccount class
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);
        account.displayAccountDetails();

        account.deposit(500.0);
        account.displayAccountDetails();

        account.withdraw(200.0);
        account.displayAccountDetails();

        account.withdraw(1500.0); // Attempt to withdraw more than the balance
        account.deposit(-100.0); // Attempt to deposit a negative amount
    }
}
