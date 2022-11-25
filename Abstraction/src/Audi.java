public class Audi extends Car{

    @Override
    void applyBrakes() {
        System.out.println("Apply brakes to audi");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerate Audi");
    }
}
