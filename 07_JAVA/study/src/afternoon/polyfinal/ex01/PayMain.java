package afternoon.polyfinal.ex01;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner scanner = new Scanner(System.in);

        int option;
        int amount;
        System.out.print("결제 옵션을 입력하세요(1. Kb 페이 / 2. 토스페이 / 3. 네이버페이) : ");
        option = scanner.nextInt();

        System.out.print("결제 금액을 입력하세요 : ");
        amount = scanner.nextInt();

        if (option == 1) {
            paySystem.SetPay(new KbPay());
        } else if (option == 2) {
            paySystem.SetPay(new TossPay());
        } else if (option == 3) {
            paySystem.SetPay(new NaverPay());
        }
        paySystem.payment(amount);
    }
}
