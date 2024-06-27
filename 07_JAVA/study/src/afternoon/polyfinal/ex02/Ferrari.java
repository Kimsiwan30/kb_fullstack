package afternoon.polyfinal.ex02;

public class Ferrari implements Drive {
    @Override
    public void openDoor(){
        System.out.println("페라리 차문을 엽니다");
    }
    @Override
    public void start(){
        System.out.println("페라리에 시동을 겁니다 부릉");
    }
    @Override
    public void stop(){
        System.out.println("경사에서 급정거 합니다");
    }
}
