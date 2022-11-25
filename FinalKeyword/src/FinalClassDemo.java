final class FinalDemo{
    int a = 10;
    //final by default
    void display(){
        a = 20;
        System.out.println("Hello " + a);
    }
}
//cannot allow inheritance when used final keyword. which means the display method cannot be overridden.
public class FinalClassDemo {

}
