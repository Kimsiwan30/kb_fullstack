package afternoon.polyfinal.ex03;

public class G70 implements Car{
    @Override
    public void openDoor(){
        System.out.println("g70 문을 엽니다");
    }

    @Override
    public  void drive(){
        System.out.println("g70 주행시작");
        System.out.println("g70 주행완료");
    }
}
