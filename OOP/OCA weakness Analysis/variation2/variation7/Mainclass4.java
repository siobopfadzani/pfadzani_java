package variation2.variation7;

public class Mainclass4 {
    public static void main(String[] args) {
        finalAbstractClass finalA = new finalAbstractClass();
    }
    
}
abstract class AbstractClass
{
    abstract void method4();
}
final class finalAbstractClass extends AbstractClass
{
    void method4()
    {
        System.out.println("final class");
    }
}

