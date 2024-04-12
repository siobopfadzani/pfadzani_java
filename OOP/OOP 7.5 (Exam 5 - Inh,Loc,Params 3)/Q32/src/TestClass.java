public class TestClass
{
    protected TestClass()
    {
        System.out.print("test");
    }
    private TestClass(int a){
        System.out.println("i have to be private or protected");
    }
    private TestClass(int b, int c){
        System.out.println("i have to be private");

    }
}
