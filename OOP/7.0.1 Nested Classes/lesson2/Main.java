
public class Main
{
    public static void main(String[]args)
    {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = out.new InnerClass();
        System.out.println(inner.testInt);
    }
}
