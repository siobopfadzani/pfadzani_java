public class TestClass
{
    static int si = 10;
    static int h = 20;
    public static void main(String[]args)
    {
        new TestClass();
    }
    public TestClass()
    {
        System.out.println(this);
    }
    public String toString()
    {
        return "TestClass.si = " + this.si;
    }
}
