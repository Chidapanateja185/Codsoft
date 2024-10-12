
public class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit amount method
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw amount method
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else
            return false;
    }

    // Check balance method
    public double getBalance() {
        return balance;
    }

}
