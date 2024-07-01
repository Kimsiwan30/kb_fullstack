package afternoon.lang.immutable.ex;

public class ImmutableDataMain {
    public static void main(String[] args) {
        ImmutableData date1 = new ImmutableData(2024, 7, 1);
        ImmutableData date2 = date1;

        date2 = date2.setYear(2025);
        System.out.println("date2의 년도만 2025년으로 변경");

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
