public class NestedDoWhile {
    public static void main(String[] args)
    {
    int i = 0;  
        do
        {
         System.out.println("Outer = "+i);

         do
         {
            System.out.println(" Inner = "+i);
            i++;
         }while(i<5);
         i++;
       }while(i<5);
    }
}
