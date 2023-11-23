
public class myArrayay_Challenge12
{
   public static void main(String[]args)
   {

         int[][] Arr = new int[100][30];
         int j = 1;
         int i = 1;

         while (i < Arr.length)
         {
            while ( j < Arr[i].length)
            {
               Arr[i][j] +=1;
               System.out.println("values "+ i +" "+Arr[i][j]);
            }
            j+=2
         }
         i+=2;
         j =0;
   }
}
