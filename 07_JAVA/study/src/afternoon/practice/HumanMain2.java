package afternoon.practice;

public class HumanMain2 {
    public static void main(String[] args) {
        Human[] humans = {new Chinnse(), new American(), new Japannes(), new Korean()};


        for (Human human : humans) {
            doMethod(human);
        }
    }


    public static void doMethod(Human human) {
        human.speak();
        human.eat();
    }
}
