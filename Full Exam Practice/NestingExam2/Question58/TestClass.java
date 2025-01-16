package NestingExam2.Question58;

public class TestClass {
    public static void main(String[] args) {
        int i = 0;
        loop:
        {
            System.out.println("Loop lable line");
            try{
                for(;true;i++)
                {
                    if(i > 5)break loop;
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception");
            }
            finally{
                System.out.println("in finally");
            }
        }
    }
    
}
