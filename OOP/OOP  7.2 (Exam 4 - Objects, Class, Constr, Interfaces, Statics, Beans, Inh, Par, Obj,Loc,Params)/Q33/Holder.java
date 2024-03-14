public class Holder
{
    float length = 100F;
    static {
        width = 23.00F;
    }
    static {
        width = 25.00F;
    }
    static float width = 12.30F;
    public static void main(String[]args)
    {

        Holder h1 = new Holder();
        h1.length++;
        h1.width++;

        Holder h2 = new Holder();
        System.out.println(h2.width + ", ");
        System.out.println(h2.length + ", ");

    }
}
