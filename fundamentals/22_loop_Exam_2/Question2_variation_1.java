public class Question2
{
    public static void main(String[]args)
    {
        Question2 jul = new Question2();
        jul.method1(7);
    }


    public void method1(int i)
    {
        int j = 10;

        label1: for(;j < 5;j++)
                {
                    while (true)
                    {
                        if(Math.random() > 0.5)break label1;
                    }
                }

            while (j > 0)
            {
                System.out.println(j);
            }
    }
}