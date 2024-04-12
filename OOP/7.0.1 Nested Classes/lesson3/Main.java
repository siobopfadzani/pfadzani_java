import java.util.logging.Level;

public class Main 
{
    public static void main(String[]args)
    {
        Nested2.Inner innerInstance = new Nested2.Inner();
        Level mylevel = Level.ALL;
        System.out.println(mylevel);
    }
    
}
