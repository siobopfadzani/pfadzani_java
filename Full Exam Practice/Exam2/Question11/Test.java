package Exam2.Question11;

public class Test {
    
    public static void main(String[] args) {
        int[][]a = {{00,01},{10,11}};
        int count = 0;
        for(int i = 0;i <2;i++)
        {
            for (int j = 0;j < 2;j++)
            {
                for(int k =0;k < 2;k++)
                {
                    if(k == 1)
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
