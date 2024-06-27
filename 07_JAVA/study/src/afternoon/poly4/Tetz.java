package afternoon.poly4;

public class Tetz implements Animal,Human{
    @Override
    public void eat() {
        System.out.println("테츠가 밥을 먹습니다!");
    }

    @Override
    public void sleep() {
        System.out.println("테츠가 잠을 잡니다!");
    }

    @Override
    public void think() {
        System.out.println("테츠가 생각합니다");
    }
}
