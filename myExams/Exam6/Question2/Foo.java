package Exam6.Question2;
 interface  Bar {
    default void bar()
    {

    }

    
}
abstract class FooBase
{
    public static void bar()
    {
        System.out.println("in static bar");
    }
}
public class Foo extends FooBase implements Bar{
    public static void bar()
    {
        
    }
}
