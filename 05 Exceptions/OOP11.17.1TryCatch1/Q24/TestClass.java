package Q24;

public class TestClass {
    public static void main(String[] args) {
        int k = 0;
        try{
            int i = 5/k;
        }
        catch(ArithmeticException a)
        {
            System.out.println("1");
        }
        catch(RuntimeException d)
        {
            System.out.println(2);
        }
        finally
        {
            System.out.println(4);
        }
        System.out.println("5");
    }
    
}
