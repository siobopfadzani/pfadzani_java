public class Sub extends Base{
    public void methodA()
    {
        System.out.println("SUB - methodA");
    }
    public void methodB()
    {
        System.out.println("sub  - methodB");
    }
    public static void main(String[]args)
    {
        Base b = new Sub();
        b.methodA();
        
      
        

    }
}
