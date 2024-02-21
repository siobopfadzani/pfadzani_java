public class Variation13 
{
    public static void main(String[] args) 
    {
        int i = 10;
        int j = 20;
        int sum;
        do 
        {
            sum = (i * j)%10;
        }while(sum < 10);
        System.out.println(sum * i);   
    }
    
}
