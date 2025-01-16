package Question15;

 class MyClass {
    
}
public class TestClass
{
    MyClass getMyClassObject()
    {
        MyClass mc = new MyClass();
        return mc;
    }
    public static void main(String[]args)
    {
        TestClass tc = new TestClass();
        MyClass x = tc.getMyClassObject();
        System.out.println("got myclass object");
        x = new MyClass();
        System.out.println("done");
    }
}