package afternoon.abstractt;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = new AbstractAnimal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();

        for(AbstractAnimal animal : animals) {
            animalcall(animal);
        }

    }
    static void animalcall(AbstractAnimal animal){
        animal.eat();
        animal.sound();

        if(animal instanceof Duck){
           // ((Duck)animal).fly();
            Duck duck = (Duck) animal;
            duck.fly();

        }
    }
}
