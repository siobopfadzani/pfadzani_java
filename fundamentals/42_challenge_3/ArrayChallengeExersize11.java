public class MyArrayChallenge10
{
   public static void main(String[] args)
   {
         int[][] arr = new int[100][30];

         for (int i = 0; i < arr.length; i++)
         {
            for (int j = 0; j < arr[i].length; j++)
            {
               arr[i][j] = arr[i][j]+ i +1;
   
      // Check if the value is odd and divisible by 8
   
               if (arr[i][j] % 2 == 0 && arr[i][j] % 8 == 0) 
               {
                   System.out.println("ODD and divisible by 8: " + arr[i][j]);
               }
            }
         }
   }
}
