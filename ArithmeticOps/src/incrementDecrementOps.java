public class incrementDecrementOps {
    public static void main(String[] args){
        int x = 100;
        //Post-increment: value is assigned or used first then incremented
        //y is assigned to value of x first, then x got incremented
        int y = x++;
        //Pre-increment: value is incremented first and then assigned and used.
        int z = ++x;

        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("z " + z);
    }
}
