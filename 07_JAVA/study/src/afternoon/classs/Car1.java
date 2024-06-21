package afternoon.classs;

public class Car1 {
    int num1;
    int num2;


    Car1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void sum (int num1, int num2){
        int sum = num1 + num2;
        System.out.println("매개변수를 받는 두 수의 합 : "+sum);

        System.out.println("두 수의 합 : " +(this.num1 + this.num2));
    }

    void sub (int num1, int num2){
        int sub = num1 - num2;
        System.out.println("매개변수를 받는 두 수의 차 : " +sub);
        System.out.println("두 수의 차 : "+ (this.num1 - this.num2));

    }
    void mul (int num1, int num2){
        int mul = num1 * num2;
        System.out.println("매개변수를 받는 두 수의 곱 : " +mul);
        System.out.println("두 수의 곱 : "+(this.num1 * this.num2));
    }
}



