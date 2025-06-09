package Cat1;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    // Constructor
    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }
    // Method of apply interest
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
    // Getter for interestRate
    public double getInterestRate() {
        return interestRate;
    }
}
