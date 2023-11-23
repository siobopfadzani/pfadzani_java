
public class myArrayay_Challenge8
{
   public static void main(String[]args)
   {

         int[][] Arr = new int[100][30];

         for (int i = 0;i < Arr.length;i+=2)
         {
            for (int j = 0; j < Arr[i].length;j+=2)
            {
               Arr[i][j] += 1;

               if (Arr[i][j] % 11 == 0)
               {
                  System.out.println("values in the array = "+Arr[i][j]);
               }
            }
         }
   }
}
