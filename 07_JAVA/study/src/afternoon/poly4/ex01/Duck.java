package afternoon.poly4.ex01;

public class Duck implements Animal,Fly {
    @Override
    public void sound() {
        System.out.println("오리는 꽥꽥");
    }

    @Override
    public void eat() {
        System.out.println("오리는 벌레를 먹습니다");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다");
    }
}
