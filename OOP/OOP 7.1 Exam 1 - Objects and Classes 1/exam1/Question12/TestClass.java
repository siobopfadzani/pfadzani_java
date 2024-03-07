public class TestClass{

    public static void main(String[]args)
    {
        ClassB b = new ClassC();
        ClassA a = b;

        if(a instanceof ClassA) System.out.println("A");
        if(a instanceof ClassB) System.out.println("B");
        if(a instanceof ClassC) System.out.println("C");
        if(a instanceof ClassD) System.out.println("D");
    }
}
