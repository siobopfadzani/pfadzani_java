public class question39 {
    public static void main(String[]args)
    {

        long longValue = 100;
        byte byteValue = 100;

     //breakdown of code trying to get the sequence of the code
    
        byte c = (byte)longValue;

        long d = (long)byteValue;

        int result =(int)(c + d);

        System.out.println(result);

     //original code
       
        byte b = (byte)(short)(int)longValue;
        long l = (long)(int)(short) byteValue;

        System.out.println(b + l);
    }
    
}
