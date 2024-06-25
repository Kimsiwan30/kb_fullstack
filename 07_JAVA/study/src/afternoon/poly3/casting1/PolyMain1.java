package afternoon.poly3.casting1;

public class PolyMain1 {
    public static void main(String[] args) {


        Parent parent = new Child();
        // parent.parentMethod();
        // parent.childMethod();
        // child 인스턴스가 생성은 됬으나 같이 parent안에 같이 있지는 않음
        // 데이터 타입의 한계로 접근 불가


//        Child poly = (Child) parent;
//        poly.childMethod();
        ((Child)parent).childMethod();

    }
}
