public class incrementDecrementOps2 {
    public static void main(String[] args) {
        int n1 = 100;
        int n2, n3;
        n2 = ++n1;
        n3 = n1++ + --n2;

        System.out.println("Value n1 = " + n1 );
        System.out.println("Value n2 = " + n2 );
        System.out.println("Value n3 = " + n3 );
    }
}
