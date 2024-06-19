package afternoon.classs;

public class Customer {
    String name = "김법겸";
    int age = 30;
    int total = 5000;
    boolean blacklist = false;

    Customer(){};

    Customer(String name, int age, int total, boolean blacklist){
        this.name = name;
        this.age = age;
        this.total = total;
        this.blacklist = blacklist;



    }
    void printCustomer(){
        System.out.println("고객의 성함은 = " + this.name);
        System.out.println("고객의 나이는 = " + this.age);
        System.out.println("고객의 총 사용 금액은 = " + this.total);
        System.out.println("고객의 블랙리스트 여부는 = " + this.blacklist);
    }
}
