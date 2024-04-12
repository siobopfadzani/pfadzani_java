public class question16 {
   public static void main(String[]args)
    {
      // breakdown trying to figure out the operator sequence

        int a =7/4;
         System.out.println("a = "+ a);
        int b = a*5;
         System.out.println("b = "+ b);
        int c = 4/2;
         System.out.println("c = "+ c);
        int d = b -c;
         System.out.println("result of breakdown = "+ d);
      

        //--original code do not change
         
        int i= (int)(7/4*5-4/2.0);
        
        System.out.println("original code = "+ i);
    }
}
