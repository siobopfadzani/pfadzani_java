package Q35;

public class AccesTest
{
    String a ="x";
    static char b = 'x';
    String c = "x";

    class Inner
    {
        String a = "y";
        String get(){
            String c = "temp";

            c = " "+ b;

            return c;
        }
    }
    AccesTest()
    {
        System.out.println(new Inner().get());
    }
    public static void main(String[] args) {
        new AccesTest();
    }
}