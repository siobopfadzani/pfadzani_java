package Question45;
 interface Bar {
    void bar();
    
}
abstract class FooBase
{
    public static void bar()
    {
        System.out.println("in static bar");
    }

}
public class FOO extends FooBase implements Bar{
    
}
