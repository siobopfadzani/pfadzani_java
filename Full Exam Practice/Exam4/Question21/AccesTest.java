package Exam4.Question21;

public class AccesTest {
    String a = "x";
    static char b = 'x';
    String c = "x";
    class Inner 
    {
        String a = "y";
        String get()
        {
            String c ="temp";
            return c;
           
            c = "" +AccesTest.b;
            c = "" + b;
            c = AccesTest.this.a;

        }
    }
    AccesTest ()
    {
        System.out.println(new Inner().get());
    }
    public static void main(String[] args) {
        new AccesTest();
    }

    
}
