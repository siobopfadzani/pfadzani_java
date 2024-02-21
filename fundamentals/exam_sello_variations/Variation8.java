public class Variation8 
{
    public static void main(String[]args)
    {
        int count  = 10;
        int [] arr = {1,2,3,4,5,6,7};

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] += 2; 

            if (arr[i]%2 ==0)
            {
                count++;
            }
        }
        System.out.println("count is  " + count);
    }   
}
