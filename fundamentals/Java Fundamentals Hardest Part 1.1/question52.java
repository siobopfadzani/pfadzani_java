public class question52 {
    public static void main (String[]args)
    {
        int n =12;
        int m = 0;
        while (n !=0)
        {
            m= (10*m)+(n%10);
            n = n/10;
        }
        System.out.println(m + "  "+n);
    }
    
}
