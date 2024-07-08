package afternoon.generic.ex3;


public class PairMain {
    public static void main(String[] args) {
        Pair<String, String> nameData = new Pair<>("김시완", "name");
        Pair<Integer, String> ageData = new Pair<>(30, "age");

        System.out.println(nameData);
        System.out.println(ageData);
    }
}
