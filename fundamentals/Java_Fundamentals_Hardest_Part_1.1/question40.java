public class question40 {
    public static void main(String [] args)
    {


        byte b = -127;
        short s = 3000;
        int i = 670000;
        Long l = 1908899l;
        float f = 167;
        double d = 687.9f;

    //breakdown of code to see the sequence of the code
        
        double y = (double)(i/f);
        l = (long)(y*s);
        l = (long)(l-b);
        l = (long)(l+f);
     

        System.out.println("break down of l: " + l);
        System.out.println("break down of d: " + d);
    

    //original code
     
        l = (long)(f+i/f*s-b);
        System.out.println(l);
        System.out.println(d);
    }
}
