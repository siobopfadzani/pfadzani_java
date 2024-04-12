public class Question33 {
    public static void main(String[]args)
    {
        int []src = new int []{1,3,14,19,0,'?'};
        int [] dest =  new int[6];

        for (int i = 0;i < dest.length;i++)
        {
            dest[i] = '?';
        }
        System.arraycopy(src, 4, dest, 0, 1);

        for(int i = 0; i < dest.length;i++)
        {
            System.out.println(dest[i]);
        }
    }
    
}
