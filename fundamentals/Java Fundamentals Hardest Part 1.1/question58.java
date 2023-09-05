public class question58 {
    static String s = "";

    public static void main (String[]args)
    {
        int[] x = new int[]{25,25,65,72,92};
        int sum = 0;
        for(int i : x)
        {
            if (i%2 == 0)
            {
                continue;
            }else
            {
                if(i%5 !=0)
                {
                    continue;
                }else
                {
                    sum+=i;
                    if(sum < 50)
                    {
                        continue;
                    }
                    System.out.println(" " + i);
                }
            }
        }
        
    }
    
}
