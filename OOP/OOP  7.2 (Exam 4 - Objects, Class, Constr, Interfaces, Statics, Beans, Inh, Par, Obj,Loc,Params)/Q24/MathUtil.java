public class MathUtil {
    public static int add(int a ,int b)
    {
        a++;
        b++;
        return a + b;
    }
    public static void main(String[]args)
    {
        int m = 10;
        int n = 20;
        int o = add(m , n);
        System.out.println(o);
    }
}
