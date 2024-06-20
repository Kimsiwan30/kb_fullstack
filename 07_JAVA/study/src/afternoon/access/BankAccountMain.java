package afternoon.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(500);
        account.getBalance();
        account.deposit(-100);
        account.withdraw(100);
        account.withdraw(-30);
        account.withdraw(300);
        account.getBalance();
    }
}
