package Question2;

public class App {
    public static void main(String[] args) throws Exception{
        try{
            switch (Integer.parseInt(args[0])) {
                case 1:
                    System.out.println("case1");
                    throw new IllegalStateException();
                case 2:
                    System.out.println("case2");
                    throw new IllegalArgumentException();
                
                case 3:
                    System.out.println("case2");
                    throw new IllegalArgumentException();
                    
                case 4:
                    System.out.println("case2");
                    throw new IllegalArgumentException();
                case 5:
                    System.out.println("case2");
                    throw new IllegalArgumentException();
                default:
                    System.out.println("default");
                    throw new Exception();
                    
            }
        }finally
        {
            System.out.println("finally");
        }
    }
    
}
