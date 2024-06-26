package afternoon.interfacee;

public class Korean implements Human{
    @Override
    public void speak(){
        System.out.println("안녕하세요");
    }
    @Override
    public void eat(){
        System.out.println("김치찌개");
    }

    @Override
    public void  hello(){
        System.out.println("안녕하세요. 지금은" + year + "년 입니다!");
    }
}
