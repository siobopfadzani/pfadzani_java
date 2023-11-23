public class question52 {
    public static void main (String[]args)
    {


        int n =12;
        int m = 0;
        
    // breakdown of code to see the sequence of the code

        while (n !=0)
        {
            m = (10*m);
            m= m +(n%10);
            n = (n/10);
        }
        System.out.println("breakdown value is " + m +"  breakdown value " + n);
    // Original code
        
        while (n !=0)
        {
            m= (10*m)+(n%10);
            n = n/10;
        }
        System.out.println(m + "  "+n);  
     }
    
}
