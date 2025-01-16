package Question44;

import java.io.FileNotFoundException;
import java.io.IOException;

class Great
{
    public void doStuff()throws IOException
    {

    }
}
class Amazing extends Great
{
    public  void doStuff() throws IllegalArgumentException
    {

    }
}
public class TestClass {
    public static void main(String[] args) throws IOException {
        Great g = new Amazing();
        g.doStuff();
    }
    
}
