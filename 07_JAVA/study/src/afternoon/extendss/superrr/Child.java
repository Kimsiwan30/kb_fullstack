package afternoon.extendss.superrr;

public class Child extends Parent {
    public Child(String name) {
        super();   // 부모의 기본 생성자, 생략가능
        System.out.println("child 생성자");
    }

    public Child(String name, int age) {
        super(); //생략된 부모의 기본 생성자
        System.out.println("child 생성자2");
    }
}
