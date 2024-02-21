public class Question53 
{
        static int x;
        static int y;
    public static void main(String[]args)
    {
        //Original code
        do{
            y = x +7;
            x++;
        }while(x < 9);
        System.out.println("original x = "+ x);

        x = 0;

        //first option
        y = x + 7;
        x++;
        while(x < 9)
        {
            y = x + 7;
            x++;
        }
        System.out.println("first x = "+ x);
        //secoond option
        x = 0;
        while (x < 9)
        {
            y = x + 7;
            x++;
        }
        y = x + 7;
        x++; 
        System.out.println("second x = "+ x);

        //thrid option
        x = 0;
        while(x <= 9)
        {
            y = x + 7;
            x++;
        }
        System.out.println("third x = "+ x);
    }
    
}
