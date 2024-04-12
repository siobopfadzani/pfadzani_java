public class Variation7 {
    public static void main (String[] args) {
        int k = 9,y = 9; 

        System.out.println(y);

        for (k = 9;k < y; y++,--k)
        {
           if (y < k)
           {
            continue;
           }
        }
        System.out.println(k);
    }
    
}
