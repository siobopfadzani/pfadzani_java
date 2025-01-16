package Question53;

public class Main {
    public static void main(String[] args) {
        MyClass my1 = new MyClass();
        SuperClas sc = new SuperClass();
        GrandSuperClass gsc = new GrandSuperClass();
        GrandSUperClass gsc1;
        sc = (SuperClass)gsc;
        gsc = my1;
        my1 = (MyClass)gsc;
        my1 = (MyClass)sc;
    }
    
}
