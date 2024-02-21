package constructor_test;

public class ConstructorTest 
{
    public ConstructorTest()
    {
        this(2024,2);
        System.out.println("you are ");
    }
    public ConstructorTest(String name)
    {
        this();
        System.out.println("pfadzani");
    }
    public  ConstructorTest(int a, int b)
    {
        int total = a - b;
        System.out.println(total);
    }
}

