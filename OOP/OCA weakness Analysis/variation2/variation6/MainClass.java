package variation2.variation6;

public class MainClass 
{
    public static void main(String[] args) {
        finalclass.method1();        
    }    
}
final class finalclass
{
    static void method1()
    {
        System.out.println("final class");
    }
}
class nonClass  // compilation error if these class is extended 
{
    static void method1()
    {
        System.out.println("non class method 1");
    }
}

