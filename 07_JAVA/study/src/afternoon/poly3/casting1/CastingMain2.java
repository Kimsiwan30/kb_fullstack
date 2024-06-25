package afternoon.poly3.casting1;

public class CastingMain2 {
    public static void main(String[] args) {
        // # 1번 코드
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

        // # 2번 코드
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;

        //2번코드에서 parent안에 child라는 자식요소가 없기떄문

    }
}
