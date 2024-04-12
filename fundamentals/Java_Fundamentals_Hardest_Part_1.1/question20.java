public class question20 {
    public static void main(String[]args)
    {
        //breakdown trying to figure out the operator sequence
         
         double k = 2.000;
         
         long i = (long)k;
         double result = i*0.1;
         System.out.println("breakdown result is: " + result);
        
        // original code
        
       System.out.println("original result: "+(long) k*0.1);
    }
}
