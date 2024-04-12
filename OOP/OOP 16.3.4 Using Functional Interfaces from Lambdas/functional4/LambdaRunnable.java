package functional4;

public class LambdaRunnable 
{
    public static void main(String[] args) {
        Runnable runnable = () ->{
            System.out.println("pfadzani");
        };

        for (int i = 0;i < 10;i++) {runnable.run();}
    }
    
}
