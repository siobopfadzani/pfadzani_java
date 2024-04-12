
public class myArrayay_Challenge4
{
	public static void main(String[] args)
	{
      // Declaration and initialize of a empty int myArrayay of size 50

         int[] Arr = new int[50];

         for (int i = 0;i < Arr.length;i++)
         {
            Arr[i] = Arr[i] + i + 1;
            System.out.println("i = "+ i +" values in Arr "+Arr[i]);
         }
        
    }
}
