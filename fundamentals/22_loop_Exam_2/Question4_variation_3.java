public class Question4_variation_3
{
    public static void main(String[]args)
    {
        label1: for(int a = 0;a > 10;a++)
                {
            label2:for (int b = 0;b < 10;--b)
                    {
                        System.out.println(a+ " " +b);
                        if (b == 0)
                        {
                            continue label1;
                        }
                    }
                }
    }
}