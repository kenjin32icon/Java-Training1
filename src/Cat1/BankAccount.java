package Cat1;
//        You're developing a banking system where account balances must not be modified directly from outside the class.
//
//        Write a Java program with the following:
//
//        A class BankAccount with private fields: accountNumber, balance, and ownerName.
//        Use encapsulation to provide access via getters and setters.
//        Include methods deposit(double amount) and withdraw(double amount).
//        Create a subclass SavingsAccount that adds an interest rate and a method applyInterest().
public class BankAccount {
    //private fields
    private String ownerName;
    private String accountNumber;
    private double balance;

    //getters and setters for the private fields
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Field constructors
    public BankAccount(String ownerName, String accountNumber, double initialBalance){
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //Method of depositing money
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("DEposited amount must be positive. ");
        }

    }

    //Method of withdrawing money
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: "+ amount);
        }
        else{
            System.out.println("Invalid withdrawal amount. ");
        }
    }
}
