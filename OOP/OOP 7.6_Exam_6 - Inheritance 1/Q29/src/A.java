public class A
{
    public void mA(){}
    public static void main(String[]args)
    {
        A x = new B();

        x.mA();
        B y = new B();
        y.mA();
        B z = new C();
        z.mB();
    }
}
class B extends A{
    public void mA(){}
    public void mB(){}
}
class C extends B{
    public void mC(){}
}
