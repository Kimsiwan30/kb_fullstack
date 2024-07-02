package afternoon.nested.inner;

public class OuterMain {
    public static void main(String[] args) {
        Outer outer = new Outer();


        Outer.Inner nested = outer.new Inner();


    }
}
