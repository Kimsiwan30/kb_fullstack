package afternoon.scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand = (int) (Math.random() * 100);

        while (true){
            System.out.print("숫자를 입력하세요 : ");
            int x = sc.nextInt();

            if(x == rand){
                System.out.println("정답입니다");break;
            }
            else if(x < rand){
                System.out.println("down");
            }
            else {
                System.out.println("up");
            }
        }

    }
}











