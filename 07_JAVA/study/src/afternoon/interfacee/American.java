package afternoon.interfacee;

public class American implements Human{
    @Override
    public void speak(){
        System.out.println("Hello");
    }
    @Override
    public void eat(){
        System.out.println("American eat hamburger");
    }

    @Override
    public void  hello(){
        System.out.println("Hello. it is currently the year 2024");
    }
}
