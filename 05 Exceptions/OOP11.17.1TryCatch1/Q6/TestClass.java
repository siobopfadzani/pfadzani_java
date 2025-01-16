package Q6;

public class TestClass {
    public static void main(String[]args)
    {
        try{
            int x = 0;
            int y = 5/x;
        }
        catch (Exception e)
        {
            System.out.println("except");
        }
        catch (ArithmeticException a)
        {
            
        }
        
    }
    
}
