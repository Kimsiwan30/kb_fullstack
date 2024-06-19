package afternoon.classs;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("김시완", 30, 10000, true);
        customer1.printCustomer();

        Customer customer2 = new Customer();
        customer2.printCustomer();


//        customer1.name = "김시완";
//        customer1.age = 30;
//        customer1.total = 1000000;
//        customer1.blacklist = true;
//
//        System.out.println("고객의 이름은? = " + customer1.name);
//        System.out.println("고객의 나이는? = " + customer1.age);
//        System.out.println("고객이 총 사용한 금액? = " + customer1.total);
//        System.out.println("고객의 블랙리스트인가요? = " + customer1.blacklist);
    }

}
