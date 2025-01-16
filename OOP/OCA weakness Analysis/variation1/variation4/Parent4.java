package variation4;

interface InnerParent {

    int value1 = 10;
    void method1();
}
public class Parent4 implements InnerParent{
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
    }
    public void method1()
    {
        System.out.println("method 1");
    }
}
class Child extends Parent4
{
    public void method1()
    {
        System.out.println("method 1 overriden ");
    }
}

