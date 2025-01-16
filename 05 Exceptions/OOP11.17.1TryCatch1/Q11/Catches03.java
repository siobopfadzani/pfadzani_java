package Q11;

public class Catches03 {
    public static void main(String[] args) throws Exception{
        try{
            int i = 1;
            System.out.println("step1");
            System.out.println("step2");
            if(i > 0)
            {
                throw new Exception("failure");
            }
            try{
                try{
                    System.out.println("step3");
                }
                finally
                {
                    System.out.println("step 5");
                }
                System.out.println("step5");
            }
            finally{
                System.out.println("step6");
            }
            System.out.println("step7");
        }
        finally{
            
        }
    }
    
}
