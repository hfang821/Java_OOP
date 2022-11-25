public class FinalMain {
    public static void main(String[] args) {
        //cannot be reassigned
        final int a;
        //cannot be changed again
        a=10;
        System.out.println("a: " + a);
    }
}
