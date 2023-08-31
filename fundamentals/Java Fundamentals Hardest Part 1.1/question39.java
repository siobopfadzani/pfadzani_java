public class question39 {
    public static void main(String[]args)
    {
        long longValue = 100;
        byte b = (byte)(short)(int)longValue;

        byte byteValue = 100;
        long l = /*(long)(int)*/(short) byteValue;

        System.out.println(b + l);
    }
    
}
