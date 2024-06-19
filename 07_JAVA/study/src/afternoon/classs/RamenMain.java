package afternoon.classs;

public class RamenMain {
    public static void main(String[] args) {
        Ramen ramen1 = new Ramen();

        ramen1.shape = "두꺼운 면";
        ramen1.topping = "적게";
        ramen1.price = 8000;

        System.out.println("라면의 면은? = " + ramen1.shape);
        System.out.println("라면의 토핑은? = " + ramen1.topping);
        System.out.println("라면의 가격은? = " + ramen1.price);
        System.out.println("라면이 나오는 시간? = " + ramen1.makeTime);


    }
}
