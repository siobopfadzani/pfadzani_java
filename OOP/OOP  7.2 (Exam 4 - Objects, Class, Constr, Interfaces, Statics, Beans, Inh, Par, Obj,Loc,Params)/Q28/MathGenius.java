public class MathGenius
{
    public void printDouble(int a, int b)
    {
        a *= 2;
        b *= 2;

        System.out.println(a + " ");
        System.out.println(b);
    }
    public static void main(String[]args)
    {
        int x = 10;
        int y = 20;
        new MathGenius().printDouble(x ,y);
        System.out.println(x + " " + y);
    }
}
