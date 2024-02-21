public class Variation12 
{
    public static void main(String[] args) 
    {
        int sum =0;

        for(int i = 0; i < 5;i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if (j % 3 == 0)
                {
                    sum = sum + 10;
                }
            }
           
        }
        System.out.println(sum);
    }  
}
