package afternoon.interfacee.ex02;

public class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("개가 밥을 먹습니다");
    }
    @Override
    public void sleep(){
        System.out.println("개가 잠을 잡니다");
    }
}
