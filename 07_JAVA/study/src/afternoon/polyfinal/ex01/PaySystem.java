package afternoon.polyfinal.ex01;

public class PaySystem {
    private Pay pay;

    public void SetPay(Pay pay){
        this.pay = pay;
    }

    public void payment(int amount){
        System.out.println("결제를 시작합니다");
        pay.pay(amount);
    }
}
