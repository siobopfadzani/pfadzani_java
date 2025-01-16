package Question22.variation4;

public class MainClass1 
{
    public static void main(String[] args) 
    {
       new TestJavaBean(5);
       new TestJavaBean();
    } 
}
class TestJavaBean
{
    private int A = 100;

    TestJavaBean()
    {
        System.out.println("value at no args " + A);
    }
    TestJavaBean (int a)
    {  
        this.A = a;
        System.out.println("value two args " + A);
    }
}
