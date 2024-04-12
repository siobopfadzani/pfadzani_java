public class question16 {
    public static void main(String[]args)
    {
        int i = 0,j=9;


//breakdown of code to see the sequence of the code

         do
        {
            i++;
            if(j-- < i++)
            {
                break;
                // System.out.println("value of i in the if statement " + i);
                // System.out.println("value of j in the if statement " + j);
            }
              System.out.println("value of i in the loop statement " + i);
              System.out.println("value of j in the loop statement " + j);
       
        } while(i<3);
        System.out.println("value of i after breakdown " + i + " value of i after breakdown " + j);
    

//Original code
        do
        {
            i++;
            if(j--<i++)
            {
                break;

            }
       
        } while(i<3);
        System.out.println(i + " " + j);
    }
}
