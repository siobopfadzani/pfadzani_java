public class question40 {
    public static void main(String [] args)
    {
        byte b = -127;
        short s = 3000;
        int i = 670000;
        Long l = 1908899L;
        float f = 167;
        double d = 687.9f;
        l = (long)(f+i/f*s-b);
        System.out.println(l);
        System.out.println(d);
    }
}
