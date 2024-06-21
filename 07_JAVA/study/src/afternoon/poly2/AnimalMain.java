package afternoon.poly2;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Cat cat = new Cat();
        Chiken chiken = new Chiken();
        Dog dog = new Dog();


        soundAnimal(donkey);
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(chiken);



    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
