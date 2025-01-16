public class TestClass
{
    static int a;
    int b;

    public TestClass(){
        int c;
        c = a;
        a++;
        b += c;
    System.out.println("c"+ c +"a"+ a);
    }
    public static TestClass getTestClass()
    {
        return new TestClass();
    }
    public static void main(String[]args){
        new TestClass();

    }
}
