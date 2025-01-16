package Exam4.Question41;

public class TestClass {
    public static void main(String[] args) {
        try{
            System.exit(100);
        }
        finally
        {
            System.out.println("finally is always executed!");
        }
    }
    
}
