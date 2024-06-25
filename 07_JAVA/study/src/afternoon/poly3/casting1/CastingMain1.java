package afternoon.poly3.casting1;

public class CastingMain1 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child;  //부모는 자식을 담을 수 있다
        Parent parent2 = (Parent) child; //안보이지만 생략된 부분

    }
}
