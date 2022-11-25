class A{
    //Overridden Method
    void display(){
        System.out.println("Display of Class A");
    }
}

public class OverridingMain extends A{
    //ctrl + O
    @Override
    void display() {
        super.display();
    }

    //Overriding method
//    @Override
//    void display(){
//        System.out.println("Display of class overridingMain");
//    }
    public static void main(String[] args) {
        OverridingMain overridingMain = new OverridingMain();
        overridingMain.display();
    }
}

