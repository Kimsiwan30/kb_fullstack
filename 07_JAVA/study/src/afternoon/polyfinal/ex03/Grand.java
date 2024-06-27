package afternoon.polyfinal.ex03;

public class Grand implements Car {
    @Override
    public void openDoor(){
        System.out.println("grand 문을 엽니다");
    }
    @Override
    public  void drive(){
        System.out.println("grand 주행시작");
        System.out.println("grand 주행완료");
    }
}
