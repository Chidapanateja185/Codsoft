import java.util.Scanner;

public class Atm {

    private Scanner sc;
    private BankAccount account;

    public Atm(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("1)Deposit");
            System.out.println("2)Withdraw");
            System.out.println("3)check balance");
            System.out.println("4)Exit");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    getBalance();
                    break;
                case 4:
                    System.out.println("Your are out of the opreation");
                    return;
                default: {
                    System.out.println("Invailed option");
                }
            }
        }
    }

    public void deposit() {
        System.out.println("Enter the amount you want to deposit ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("current balance in your account :" + account.getBalance());
    }

    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw ");
        double amount = sc.nextDouble();

        if (account.withdraw(amount)) {
            System.out.println("amount debited " + amount);
            System.out.println("Remaining amount " + account.getBalance());
        } else {
            System.out.println("Insuffient balance");
        }
    }

    public void getBalance() {
        System.out.println("Total amount in your account : " + account.getBalance());
    }

}
