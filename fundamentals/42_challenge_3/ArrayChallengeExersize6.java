
public class myArrayay_Challenge6
{
	public static void main(String[] args)
	{
      // Declaration and initialize of a empty int myArrayay of size 50

         int[] Arr = new int[50];

         int i = 0;
         
         while (i < Arr.length)
         {  

            Arr[i] = Arr[i] + 1;
            
            switch (Arr[i] % 11)
            {  

               case 0 :
                  System.out.println(" values in Arr " +Arr[i]);
                  break;
         
               default :
                  break;
            }

            i += 2;
         }   
   }
}
