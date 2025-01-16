package Question43;

public class TestClass {
    public void method(Object o){System.out.println("object version");}
    public void method(java.io.FileNotFoundException s){
        System.out.println("java.io.FileNotFoundException version");
    }
    public void method(java.io.IOException s)
    {
        System.out.println("IOException version");
    }
    public static void main(String[]arg)
    {
        TestClass tc = new TestClass();
        tc.method(null);
    }
}
