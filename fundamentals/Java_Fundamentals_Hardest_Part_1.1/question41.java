public class question41 {
    public static void main(String[]args)
    {


        byte b =-127;
        short s = 3000;
        int i = 670000;
        long l = 1908899;
        float f = 167;
        double d = 687.9f;
    //breakdown of code inorder to see the sequence of the code
        
        double y = (double)(i/f);
        l = (long)(y*s);
        l = (long)(l-b);
        l = (long)(l+f);
     

        System.out.println("break down of l: " + l);
        System.out.println("break down of d: " + d);

        // Original code

        
        l = (long)(f+i/f*s-b);
        System.out.println(l);
    }
    
}
