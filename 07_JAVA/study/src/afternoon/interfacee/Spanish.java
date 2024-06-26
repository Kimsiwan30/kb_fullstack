package afternoon.interfacee;

public class Spanish implements Human{
    @Override
    public void speak(){
        System.out.println("Hola");
    }
    @Override
    public void eat(){
        System.out.println("pizza");
    }

    @Override
    public void  hello(){
        System.out.println("Hola. 2024");
    }
}
