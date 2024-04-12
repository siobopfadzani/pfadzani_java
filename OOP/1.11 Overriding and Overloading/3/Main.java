package 3;

public class Main {
    public static void main(String[]args)
    {
        long x = add((long)1, 1);
    }

    static long add(long  a , int b)
    {
        System.out.println("method 1");
         return a + b;
    }
    static int add(int a ,int b, int c)
    {
        System.out.println("method 2");
        return a + b + c;
    }
    static int add(int a, int b , int c, int d)
    {
        System.out.println("method 3");
        return a + b + c + d;
    }
    static long add(int a , long b)
    {
        System.out.println("method 4");
        return a + b;
    }
    
}
