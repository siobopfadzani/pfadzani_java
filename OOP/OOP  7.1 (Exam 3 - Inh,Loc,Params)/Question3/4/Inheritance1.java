public class Inheritance1
{
    public static void main(String[] args) 
    {
        Inheritance2 inherit = new Inheritance2();
        inherit.test();    
    }
    protected void test()
    {
        System.out.println("test");
    }
}