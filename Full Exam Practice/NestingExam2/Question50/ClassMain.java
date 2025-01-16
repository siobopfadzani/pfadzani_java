package NestingExam2.Question50;

public class ClassMain {
    public void method1(int i)
    {
        int j = (i*30-2)/100;
        POINT: for(;j <10;j++)
        {
            boolean flag = false;
            while(!flag)
            {
                if(Math.random() > 0.5)break POINT;
            }
        }
        while (j > 0) {
            System.out.println(j--);
            if(j == 4) break POINT;
            
        }
    }
   
}
