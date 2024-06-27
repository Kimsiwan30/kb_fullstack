package afternoon.polyfinal.ex02;

public class Porsche implements Drive{
    @Override
    public void openDoor(){
        System.out.println("포르쉐 차문을 엽니다");
    }
    @Override
    public void start(){
        System.out.println("포르쉐에 시동을 겁니다 부릉");
    }
    @Override
    public void stop(){
        System.out.println("장애물에서 급정거 합니다");
    }
}
