public class Question4 {
    public static void main(String[]args)
    {
        int i =1,j;
        do
        {
            for(j=1;;j++)
            {
                if(j>2)
                break;
                if(i==j)
                continue;
                System.out.println(i +" "+ j);
            }
            i++;
        }while(i<3);
        System.out.println();
    }
}
