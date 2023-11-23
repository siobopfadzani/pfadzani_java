
public class myArrayay_Challenge9
{
   public static void main(String[]args)
   {

         int[][] Arr = new int[100][30];

         int i = 0;
         int j = 0;
         while (i < Arr.length)
         {
            while (j < Arr[i].length)
            {
               
               Arr[i][j] += 1;
               switch (Arr[i][j] % 11)
               {
                 case 0:
                    System.out.println("values in the array = "+Arr[i][j]);
                    break;
                  default :
                     break;
               }

               j += 2;

            }

            i += 2;
            j=0;

         }
   }
}
