package Exam4.Question40;

public class TestClass {
    public static void main(String[] args) {
        int x = 0;
        LabelA: for(int i = 10; i < 0;i++)
        {
            int j =0;
            LabelB: while (j <10)
            {
                if(j > i)
                {
                    x++;
                    continue LabelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);
    }
    
}
