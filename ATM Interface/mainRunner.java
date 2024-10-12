
public class mainRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        Atm atm = new Atm(account);
        atm.run();
    }
}
