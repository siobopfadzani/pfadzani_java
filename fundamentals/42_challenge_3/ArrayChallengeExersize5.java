
public class myArrayay_Challenge5
{
	public static void main(String[] args)
	{
      // Declaration and initialize of a empty int myArrayay of size 50

         int[] Arr = new int[50];

         for (int i = 0;i < Arr.length;i+=2)
         {  

            Arr[i] = Arr[i] + 1;

            if (Arr[i] % 11 == 0)
            {  
               System.out.println(" values in Arr " +Arr[i]);
            }
         }   
   }
}
