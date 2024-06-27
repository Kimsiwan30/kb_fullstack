package afternoon.interfacee.ex02;

public class Cat implements Animal{
    @Override
    public void eat(){
        System.out.println("고양이가 밥을 먹습니다");
    }
    @Override
    public void sleep(){
        System.out.println("고양이가 잠을 잡니다");
    }
}
