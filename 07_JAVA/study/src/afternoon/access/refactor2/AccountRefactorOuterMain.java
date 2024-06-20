package afternoon.access.refactor2;

import afternoon.access.refactor.AccountRefactor;

public class AccountRefactorOuterMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("우리은행", "골드", "김시완", 10000);

        //public 요소 접근
        System.out.println(account.bank);

        //default 요소 접근
        //System.out.println(account.grade);
    }
}
