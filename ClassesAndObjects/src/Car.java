public class Car {
    public String model;
    public String color;
    public int seats;

    public Car() {
        model = "Test Model";
        color = "test color";
        seats = 4;
        System.out.println("First Constructor");
    }
    //Constructor
    public Car(String model, String color, int seats){
        //use "this" keyword to refer to the instance variable, if you don't, it will assign a parameter to a parameter.
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    //Method
    public void display(){
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Seats is " + seats);
    }


}
