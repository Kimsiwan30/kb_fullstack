package afternoon.pack;




import afternoon.pack.nouveau.Customer;
import afternoon.pack.a.Boss;



public class PackageMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();

        afternoon.pack.nouveau.Customer customer2 = new afternoon.pack.nouveau.Customer();

        Boss boss1 = new Boss("시완", 30);
        boss1.printBoss();

    }
}
