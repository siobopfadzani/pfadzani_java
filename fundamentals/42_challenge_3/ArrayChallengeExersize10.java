
public class myArrayay_Challenge10
{
   public static void main(String[]args)
   {

         int[][] Arr = new int[100][30];

         for (int i = 0;i < Arr.length; i++)
         {
            for (int j = 0; j < Arr[i].length; j++)
            {
               Arr[i][j] = Arr[i][j]+ i + 1;
               System.out.println("values "+ Arr[i][j]);
            }
         }

   }
}
