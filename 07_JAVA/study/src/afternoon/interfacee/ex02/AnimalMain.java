package afternoon.interfacee.ex02;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();


    }
}
