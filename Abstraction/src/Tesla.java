public class Tesla extends Car{

    @Override
    void applyBrakes() {
        System.out.println("Applying brakes to Tesla");
    }

    @Override
    void accelerate() {
        System.out.println("Applying brakes in Tesla");
    }
}
