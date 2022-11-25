public class OverloadingMain {
    public OverloadingMain(){
        System.out.println("Constructor with no parameter");
    }
    public OverloadingMain(int a){
        System.out.println("Constructor with 1 parameter");
    }
    public OverloadingMain(int a, int b){
        System.out.println("Constructor with 2 integer parameter");
    }
    public OverloadingMain(int a, String b){
        System.out.println("Constructor with 1 integer, 1 string parameter");
    }
    public static void main(String[] args) {
        new OverloadingMain();
        new OverloadingMain(3);
        new OverloadingMain(1,3);
        new OverloadingMain(1,"3");
    }
}
