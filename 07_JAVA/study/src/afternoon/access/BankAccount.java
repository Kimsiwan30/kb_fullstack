package afternoon.access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if(isVaildAmount(amount)){
            this.balance += amount;
            System.out.println("현재 잔고는 : " + this.balance + "입니다")  ;
        } else {
            System.out.println("error");
        }
    }
    public void withdraw(int amount) {
        if(isVaildAmount(amount)){
            if(isPossibleWithdraw(amount)){
                this.balance -= amount;
                System.out.println("현재 잔고는 : " + this.balance + "입니다");
            } else {
                System.out.println("잔고가 부족. 현재 잔고 : " + this.balance + "입니다");
            }
        }else {
            System.out.println("error");
        }
    }

    public void getBalance() {
        System.out.println("현재 잔고는 : " + this.balance + "입니다");

    }

    private boolean isVaildAmount(int amount) {
        return amount > 0;
    }

    private boolean isPossibleWithdraw(int amount) {
        return this.balance >= amount;
    }
}
