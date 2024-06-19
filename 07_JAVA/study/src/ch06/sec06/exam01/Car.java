package ch06.sec06.exam01;

public class Car {
    String model; // null
    boolean start;  // false
    int speed; // 0
}

class Carmain {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("모델 :" +car.model);
        System.out.println("start :" +car.start);
        System.out.println("speed :" +car.speed);
    }
}
