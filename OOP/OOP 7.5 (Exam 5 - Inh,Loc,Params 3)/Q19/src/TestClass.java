

public class TestClass
{
    public static void main(String[]args) throws Exception
    {
        Data d = new Data(1,1);
        d.x = 2;
        d.y = 2;
        System.out.println("d.x = "+ d.x + " d.x = " + d.y);

        d = new Data(2 , 1);
        System.out.println("d.x = "+ d.x + " d.x = " + d.y);

        d.y += 1;
        d.x += 1;
        System.out.println("d.x = "+ d.x + " d.x = " + d.y);
    }
}
