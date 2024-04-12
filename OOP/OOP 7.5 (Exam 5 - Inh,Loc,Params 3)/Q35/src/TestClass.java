public class TestClass
{
    int i,j;
    public TestClass getInstance()
    {
        return new TestClass();
    }
    public void TestClass(int x,int y){
        getInstance().j = 2;
        i = x;
        j = y;
    }
    public TestClass TestClass()
    {
        return new TestClass();
    }
}
