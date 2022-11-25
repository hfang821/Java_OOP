public class ClassesMain {
    public static void main(String[] args) {
        //create an object using the constructor
        Car ferrari;
        ferrari = new Car("Ferrari F430", "Red", 4);
        ferrari.display();

        Car tesla = new Car();
        tesla.model = "Model S";
        tesla.seats = 4;
        tesla.color = "Black";
        tesla.display();

        Car audi = new Car();
        audi.model = "Q4";
        audi.seats = 4;
        audi.color = "blue";
        audi.display();

        //Step 1: Object Declaration
        Car test;
        //Step 2: Memory Allocation
        test = new Car();
    }
}
