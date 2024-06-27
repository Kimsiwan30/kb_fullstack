package afternoon.polyfinal.ex01;

public class NaverPay implements Pay{
    @Override
    public void pay(int amount){
        System.out.println("Naver Pay 시스템에 연결합니다");
        System.out.println(amount + "원 결제합니다");
        System.out.println("결제 성공!");
    }
}
