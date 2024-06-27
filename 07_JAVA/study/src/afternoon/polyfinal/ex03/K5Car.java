package afternoon.polyfinal.ex03;

public class K5Car implements Car {
    @Override
    public void openDoor(){
        System.out.println("k5 문을 엽니다");
    }

    @Override
    public  void drive(){
        System.out.println("k5 주행시작");
        System.out.println("k5 주행완료");
    }
}
