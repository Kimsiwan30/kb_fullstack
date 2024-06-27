package afternoon.polyfinal.ex01;

public class KbPay implements Pay{
    @Override
    public void pay(int amount){
        System.out.println("Kb 시스템에 연결합니다");
        System.out.println(amount + "원 결제합니다");
        System.out.println("결제 성공!");
    }
}
