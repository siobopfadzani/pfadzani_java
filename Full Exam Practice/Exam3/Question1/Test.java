package Exam3.Question1;

public class Test {
    public static void main(String[] args) {
        int c = 0;
        A: for(int i = 0;i < 2;i++)
        {
            B: for(int j = 0;j < 2;j++)
            {
                for(int k = 0;k < 3;k++)
                {
                    c++;
                    if(k > j)break;
                }
            }
        }
        System.out.println(c);
    }
    
}
