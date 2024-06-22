package afternoon.classs;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("김시완", 10000);
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("1(입금) 또는 2(출금) 3(현재잔고) 4(소유자이름) 5(종료) 선택하세요 : ");
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.print("입금할 금액은 : ");
                account1.deposit(sc.nextInt());
            } else if (input.equals("2")) {
                System.out.print("출금할 금액은 : ");
                account1.withdraw(sc.nextInt());
            } else if (input.equals("3")) {
                System.out.print("현재 잔고는 : ");
                account1.showBalance();
            } else if (input.equals("4")) {
                System.out.println("소유자 이름은 : ");
                account1.showOwner();
            } else {
                input.equals("5");
                System.out.println("프로그램 종료");
                break;
            }


//        account1.deposit(-1000);
//        account1.withdraw(10000);
//        account1.showBalance();
//        account1.showOwner();

        }
    }
}