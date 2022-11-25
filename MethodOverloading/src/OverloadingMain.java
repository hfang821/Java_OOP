public class OverloadingMain {
    public void add(){
        System.out.println("output: " + 2);
    }
    public void add(int a){
        System.out.println("output: " + (a+a));
    }
    public void add(int a, int b){
        System.out.println("output: " + (a+b));
    }
    public void add(int a, String b){
        System.out.println("output: " + (a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("output: " + (a+b+c));
    }

    public static void main(String[] args) {
        OverloadingMain overloadingMain = new OverloadingMain();
        overloadingMain.add();
        overloadingMain.add(2);
        overloadingMain.add(2,3);
        overloadingMain.add(2,"Test");
        overloadingMain.add(2,3,5);
    }
}
