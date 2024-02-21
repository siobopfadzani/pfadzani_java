public class Question17 {
    static int a = 12;

    public static void main(String[]args)
    {
        a = a++;
        System.out.println(a++ % 5);
    }
    
}
