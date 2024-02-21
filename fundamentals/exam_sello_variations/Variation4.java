public class Variation4 
{
    public static void main(String[] args) 
    {
        int Endpoint = 10;
        boolean condition = false;
        int sum = 0; 
        
        for (int i = 1; i < Endpoint; i++)
        {
            if (Endpoint % i == 0)
            {
                sum += i;
            }
        }
        System.out.println((sum == Endpoint)? ("sum = " + sum):("End point is " + Endpoint));
    }
}
