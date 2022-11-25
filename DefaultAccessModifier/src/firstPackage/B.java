package firstPackage;

public class B {
    void printMessageFromB(){
        A a = new A();
        a.defaultVariableInA = 100;
        a.printMessageFromA();
    }
}
