package afternoon.extendss;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();


        gasCar.fillUp();
        gasCar.move();
        gasCar.openDoor();

        electricCar.charge();
        electricCar.move();
        electricCar.openDoor();

        hydrogenCar.fillhydrogenCar();
        hydrogenCar.move();
        hydrogenCar.openDoor();



    }
}
//부모요소인 car에서 상속되어 있는것