package afternoon.poly3.overriding.ex1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Cat(), new Dog(), new Duck()};

        for (Animal a : animals) {
            animalCall(a);
        }
    }

    public static void animalCall(Animal a) {

        a.sound();
        if (a instanceof Duck) {
            ((Duck) a).fly();
        }


    }
}
