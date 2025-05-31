package BankAccount;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {

        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // initial Balance
    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        if (initialBalance > 0){
            this.balance = initialBalance;
        }
    }

    public String getAccountHolder(){
        return accountHolder;
    }
}
