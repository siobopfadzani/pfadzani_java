public class Main
{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();
        a.printthem();
        b.printthem();
        ab.printthem();
    }
}
class A{
    void printthem()
    {
        printit();
    }
    private void printit()
    {
        System.out.println("A");
    }
}
class B extends A{
    void printit()
    {
        System.out.println("B");
    }
}