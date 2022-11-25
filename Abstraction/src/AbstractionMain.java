public class AbstractionMain {
    public static void main(String[] args) {
        Car car1 = new Ferrari();
        CarRepair carRepair = new CarRepair();
        carRepair.repairCar(car1);

        Car car2 = new Audi();
        carRepair.repairCar(car2);

        Car car3 = new Tesla();
        carRepair.repairCar(car3);
    }
}
