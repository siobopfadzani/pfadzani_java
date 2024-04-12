public class Question4 {
    public static void main(String[] args) 
    {
        Question4 Q1 = new Question4();
            Q1.loopTest(0);
    }
    public void loopTest(int x)
    {
        loop: for(int i = 1;i < 5;i++)
        {
            for(int j = 1;j < 5;j++)
            {
                System.out.println(i);
                    if(x == 0)
                    {
                        continue loop;
                    }
                        System.out.println(j);
            }
        }
    }
    
}
