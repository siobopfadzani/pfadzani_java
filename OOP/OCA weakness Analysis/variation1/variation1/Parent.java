package variation1;
public class Parent
{
    
    public double getParentsMoney()
    {
            return 50.00;
    }
    public static void main(String[]args)
    {
       Parent P = new Parent();
       System.out.println(P.getParentsMoney());
    }
}
class Child extends Parent{
        
    public double getParentsMoney()
{
            return 20.00;
}
    
}