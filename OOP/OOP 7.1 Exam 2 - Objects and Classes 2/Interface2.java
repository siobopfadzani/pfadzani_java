public class Interface2 implements Interface1 
{
    
    public void hello()
    {
        System.out.println("hello");
    }
    public void Hi(){System.out.println("hi");}

    public static void main(String[] args) {
        Interface1 Inter  = new Interface2();
        Inter.hello();

        Interface2 Inter2 = new Interface2();
        Inter2.Hi();
    }
}
