package afternoon.scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int rand = (int)(Math.random()*100);

       while (true){
           System.out.println("0에서 99까지의 숫자를 입력 : ");
           int input = sc.nextInt();

           if (input > rand){
               System.out.println("down");
           } else if (input < rand){
               System.out.println("up");
           } else {
               System.out.println("정답입니다. 랜덤 숫자는" + rand);
               break;
           }
       }










    }
}
