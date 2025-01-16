package variation2.variation8;

public class Mainclass5 {
    public static void main(String[] args) {
        finalAbstractClass finalA = new finalAbstractClass();
    }
    
}
abstract class AbstractClass
{
    abstract void method4();
     void method5()
     {
        System.out.println("method 5");
     }
}
final class finalAbstractClass extends AbstractClass
{
    void method5()
    {
        System.out.println("final class");
    }
    void method4()
    {
        System.out.println("method 4");
    }
}

