package afternoon.classs;

public class Account {
    int balance;
    String accName;

    Account(String accName, int balance) {
        this.accName = accName;
        this.balance = balance;
    }

    void deposit(int money){
        this.balance = this.balance + money;
        if(money <= 0){
            System.out.println("유효하지 않은 금액입니다");
        }

        else {
            System.out.println("잔고에 추가" + "잔고는 : "+this.balance);
        }

    }
    void withdraw(int money){
        this.balance = this.balance - money;
        if(money <= 0){
            System.out.println("유효하지 않은 금액입니다");
        }

        else if(balance < money){
            System.out.println("잔고가 부족합니다");

        }else{
            System.out.println("잔고에서 뺴기" + "잔고는 : " +this.balance);
        }
    }
    void showBalance(){
        System.out.println(this.balance);
    }
    void showOwner(){
        System.out.println(this.accName);
    }
}
