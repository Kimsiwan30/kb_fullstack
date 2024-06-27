package afternoon.poly4.ex01;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("개는 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("개는 사료");
    }
}
