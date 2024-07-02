package afternoon.nested.local.ex2;

public class OuterClass {
    public void myMethod() {

        class LocalClass {
            public void hello() {
                System.out.println("지역클래스 안녕하세요");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }


}
