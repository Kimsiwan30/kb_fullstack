package afternoon.interfacee;

public class HumanMain {
    public static void main(String[] args) {
        Human[] humans = {new American(), new Korean(), new Spanish()};
        for (Human human : humans) {
            callHuman(human);

        }


    }

    public static void callHuman(Human human) {
        human.speak();
        human.eat();
        human.hello();

    }
}
