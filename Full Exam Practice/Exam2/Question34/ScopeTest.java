package Exam2.Question34;

public class ScopeTest {
    static int x = 5;
    public static void main(String[] args) {
        int x = (x=3)* 4;
        System.out.println(x);
    }
    
}
