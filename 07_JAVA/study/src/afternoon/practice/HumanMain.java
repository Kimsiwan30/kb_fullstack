package afternoon.practice;

public class HumanMain {
    public static void main(String[] args) {


        Korean korean = new Korean();
        American american = new American();
        Chinnse chinnse = new Chinnse();
        Japannes japannes = new Japannes();

        korean.speak();
        korean.eat();

        american.speak();
        american.eat();

        chinnse.speak();
        chinnse.eat();

        japannes.speak();
        japannes.eat();


    }
}
