package afternoon.polyfinal.ex02;

public class Benz implements Drive{
    @Override
    public void openDoor(){
        System.out.println("벤츠 차문을 엽니다");
    }
    @Override
    public void start(){
        System.out.println("벤츠에 시동을 겁니다 부릉");
    }
    @Override
    public void stop(){
        System.out.println("커브길에서 급정거 합니다");
    }
}
