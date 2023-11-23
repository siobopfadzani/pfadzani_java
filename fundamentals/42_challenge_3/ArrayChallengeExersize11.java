
public class myArrayay_Challenge11
{
   public static void main(String[]args)
   {

         int[][] Arr = new int[100][30];

         for (int i = 1;i < Arr.length; i+=2)
         {
            for (int j = 1; j < Arr[i].length; j+=2)
            {
               Arr[i][j] +=1;
               System.out.println("values "+ i +" "+Arr[i][j]);
            }
         }

   }
}
