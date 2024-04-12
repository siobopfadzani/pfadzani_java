public class BreakTest
{
    public static void main(String[] args) 
    {
       int i = 0;
        while(i < 10)
        {
            System.out.println("outer:"+i);
            if(i == 7)
            {

                break;
            }
            i++;
        }
        
    }           
}
