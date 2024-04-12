public class A {
    public static void sM1(){
        System.out.println("in base static");
    }
}
class B extends A {
    public static void sM1(){
        System.out.println("in sub static");
    }
    public void sM1(int a){
        System.out.println("in sub non static");
    }
}
