public class Sub extends Base
{
    @Override
    public void MethodA()
    {
        System.out.println("sub - MethodA");
    }

    public void methodB()
    {
        System.out.println("sub - MethodB");
    }
    public static void main(String[]args)
    {
        Base b = new Sub();
        b.MethodA();
        ((Sub) b).methodB();
    }
}
