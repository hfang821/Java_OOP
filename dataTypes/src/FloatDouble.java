public class FloatDouble {
    public static void main(String[] args){
        //round down to a integer
        int myInt = 10/3;
        System.out.println("int " + myInt);
        //up to 7 decimals, 4bytes
        float myFloat = 10.25f / 3;
        System.out.println("float " + myFloat);
        //up to 17 decimals, 8 bytes
        double myDouble = 10.25 / 3;
        System.out.println("double " + myDouble);
    }
}
