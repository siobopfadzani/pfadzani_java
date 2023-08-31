public class Question10 {
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            j = 1;
            while(i%j==2) 
            {
                j++;
            }
            System.out.println(i+" "+j);
        }
    }
    
}
