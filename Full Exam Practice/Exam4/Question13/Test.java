package Exam4.Question13;

public class Test {
    static boolean a;
    static boolean b;
    static boolean c;
    public static void main(String[] args) {
        boolean bool = (a = true)|| (b = true) && (c =true);
        System.out.println(a + " " + b + " "+ c);
    }

    
}
